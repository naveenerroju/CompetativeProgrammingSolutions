package com.naveen.dsa;

import com.naveen.dsa.coursera.MaxPairwise;
import com.naveen.GenerateRandomArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MaxPairwiseTest extends MaxPairwise {

    @Test
    @DisplayName("Basic Testing of prefixed 6 elements")
    void maxPairwiseTest1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(11);
        list.add(10);
        list.add(5);
        list.add(3);

        long result = improvisedAlgorithm(list);
        assertEquals(110,result);
    }

    @Test
    @DisplayName("Basic Testing of prefixed 9 elements")
    void maxPairwiseTest2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(11);
        list.add(10);
        list.add(5);
        list.add(3);
        list.add(12);
        list.add(1);
        list.add(20);

        long result = improvisedAlgorithm(list);
        assertEquals(240,result);
    }

    @Test
    @DisplayName("Randomly generated array of 5 elements in range of 1000")
    void testCase3(){
        GenerateRandomArrayList random = new GenerateRandomArrayList(5);
        ArrayList<Integer> list = random.list;

        long actualResult = improvisedAlgorithm(list);
        long expectedResult = basicAlgorithm(list);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Randomly generated array of 10 elements in range of 1000")
    void testCase4(){
        GenerateRandomArrayList random = new GenerateRandomArrayList(10);
        ArrayList<Integer> list = random.list;

        long actualResult = improvisedAlgorithm(list);
        long expectedResult = basicAlgorithm(list);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Randomly generated array of 20 elements in range of 20000")
    void testCase5(){
        GenerateRandomArrayList random = new GenerateRandomArrayList(200000, 20);
        ArrayList<Integer> list = random.list;

        long actualResult = improvisedAlgorithm(list);
        long expectedResult = basicAlgorithm(list);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Stress Test")
    void StressTest(){
        int numberOfTests = 200;
        int currentTest = 1;
        boolean status = true;

        while (currentTest <= numberOfTests){

            GenerateRandomArrayList randomArrayList = new GenerateRandomArrayList(20000, 10);
            ArrayList<Integer> list = randomArrayList.list;

            long expected = basicAlgorithm(list);
            long actual = improvisedAlgorithm(list);

            if(actual==expected){
                currentTest++;
                System.out.println("Test case "+currentTest+" passed!");
                //System.out.println(list);
            } else {
                System.out.println("Test case "+currentTest+" failed!");
                System.out.println("Given List: "+list);
                System.out.println("Actual result = "+actual);
                System.out.println("Expected result = "+expected);
                status = false;
                break;
            }
        }

        assertTrue(status);
    }

}