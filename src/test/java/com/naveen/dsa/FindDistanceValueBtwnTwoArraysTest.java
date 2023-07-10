package com.naveen.dsa;

import com.naveen.dsa.leetcode.easydifficulty.binarysearch.FindDistanceValueBtwnTwoArrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class FindDistanceValueBtwnTwoArraysTest extends FindDistanceValueBtwnTwoArrays {

    @Test
    @DisplayName("TestCase 1 in LEETCODE")
    void testCase1(){

        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;

        int actualResult = effectiveImplementation(arr1, arr2, d);
        assertEquals(2, actualResult);

    }

    @Test
    @DisplayName("TestCase 2 in LEETCODE")
    void testCase2(){

        int[] arr1 = {1,4,2, 3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d =3;

        int actualResult = effectiveImplementation(arr1, arr2, d);
        assertEquals(2, actualResult);

    }

    @Test
    @DisplayName("TestCase 3 in LEETCODE")
    void testCase3(){

        int[] arr1 = {2,1,100,3};
        int[] arr2 = {-5,-2,10,-3,7};
        int d =6;

        int actualResult = effectiveImplementation(arr1, arr2, d);
        assertEquals(1, actualResult);

    }

    @Test
    @DisplayName("TestCase 4 in LEETCODE")
    void testCase4(){

        int[] arr1 = {-3,-3,4,-1,-10};
        int[] arr2 = {7,10};
        int d =12;

        int actualResult = effectiveImplementation(arr1, arr2, d);
        assertEquals(1, actualResult);

    }

    @Test
    @DisplayName("TestCase 5 in LEETCODE")
    void testCase5(){

        int arr1[] = {1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d = 3;

        int actualResult = effectiveImplementation(arr1, arr2, d);
        assertEquals(2, actualResult);

    }


    @Disabled
    @Test
    @DisplayName("Stress Test")
    void stressTest(){

        int numberOfTests = 100;
        int d = 3;

        while (numberOfTests>0){

            Random random = new Random();
            int sizeOfArray = 20;
            int[] arr1 = new int[sizeOfArray];
            int[] arr2 = new int[sizeOfArray];

            for (int i = 0; i < sizeOfArray-1; i++) {
                arr1[i]=random.nextInt(sizeOfArray);
                arr2[i]=random.nextInt(sizeOfArray);
            }

            int expectedResult = bruteImplementation(arr1, arr2, d);
            int actualResult = effectiveImplementation(arr1, arr2, d);

            if(actualResult==expectedResult){
                System.out.println("Test case paased");
            } else {
                System.out.println("TEST CASE FAILED!!!!!!!");
                System.out.println("Array 1: "+ Arrays.toString(arr1));
                System.out.println("Array 2: "+ Arrays.toString(arr2));
                System.out.println("distance: "+d);
                System.out.println("Expected: "+expectedResult+" Actual: "+actualResult);
            }
            numberOfTests--;
        }
    }




}