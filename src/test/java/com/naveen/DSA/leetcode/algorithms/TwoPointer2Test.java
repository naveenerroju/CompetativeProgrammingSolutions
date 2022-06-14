package com.naveen.DSA.leetcode.algorithms;

//These cases are all the given examples in the cases.

import com.naveen.DSA.leetcode.algorithms.TwoPointer2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPointer2Test extends TwoPointer2 {

    @Test
    void testcase1(){
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};
        int[] actual = solution(arr, target);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testcase2(){
        int[] arr = {2,3,4};
        int target = 6;
        int[] expected = {1,3};
        int[] actual = solution(arr, target);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testcase3(){
        int[] arr = {-1,0};
        int target = -1;
        int[] expected = {1,2};
        int[] actual = solution(arr, target);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

}