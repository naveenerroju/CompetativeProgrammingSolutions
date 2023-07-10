package com.naveen.dsa.leetcode.easydifficulty.algorithms;

import com.naveen.dsa.leetcode.algorithms.twopointers.MoveZeros;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest extends MoveZeros {

    @Test
    void testcase1(){
        int[] arr = {0,1,0,3,12};
        int[] expected = {1,3,12,0,0};
        int[] actual = solution(arr);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testcase2(){
        int[] arr = {0};
        int[] expected = {0};
        int[] actual = solution(arr);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testcase3(){
        int[] arr = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};
        int[] expected = {45192,-659,-52359,-99225,-75991,-15155,27382,59818,-30645,-17025,81209,887,64648,0,0,0};
        int[] actual = solution(arr);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}