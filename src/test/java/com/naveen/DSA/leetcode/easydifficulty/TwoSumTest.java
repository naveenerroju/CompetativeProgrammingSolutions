package com.naveen.DSA.leetcode.easydifficulty;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest extends TwoSum {

    @Test
    void test1(){
        int[] arr = {3,2,4};
        int target = 6;
        int[] expected = {1,2};

        assertEquals(Arrays.toString(expected), Arrays.toString(twoPointers(arr, target)));
    }

    @Test
    void test2(){
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] expected = {0,1};

        assertEquals(Arrays.toString(expected), Arrays.toString(twoPointers(arr, target)));
    }

    @Test
    void test3(){
        int[] arr = {3,3};
        int target = 6;
        int[] expected = {0,1};

        assertEquals(Arrays.toString(expected), Arrays.toString(twoPointers(arr, target)));
    }

}