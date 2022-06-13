package com.naveen.DSA.leetcode;

import com.naveen.DSA.leetcode.mediumdifficulty.TwoSumNonSortedArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumNonSortedArrayTest extends TwoSumNonSortedArray {

    @Test
    void testcase1(){
        int[] array = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};

        boolean result = Arrays.equals(expected, solution(array,target));
        System.out.println("Expected: "+Arrays.toString(expected));
        System.out.println("Actual: "+Arrays.toString(solution(array,target)));
        assertTrue(result);
    }

    @Test
    void testcase2(){

        int[] array = {2,3,4};
        int target = 6;
        int[] expected = {1,3};

        boolean result = Arrays.equals(expected, solution(array,target));
        System.out.println("Expected: "+Arrays.toString(expected));
        System.out.println("Actual: "+Arrays.toString(solution(array,target)));
        assertTrue(result);

    }

    @Test
    void testcase3(){
        int[] array = {-1,0};
        int target = -1;
        int[] expected = {1,2};

        boolean result = Arrays.equals(expected, solution(array,target));
        System.out.println("Expected: "+Arrays.toString(expected));
        System.out.println("Actual: "+Arrays.toString(solution(array,target)));
        assertTrue(result);
    }

    @Test
    void testcase4(){
        int[] array = {0,0,3,4};
        int target = 0;
        int[] expected = {1,2};

        boolean result = Arrays.equals(expected, solution(array,target));
        System.out.println("Expected: "+Arrays.toString(expected));
        System.out.println("Actual: "+Arrays.toString(solution(array,target)));
        assertTrue(result);
    }

}