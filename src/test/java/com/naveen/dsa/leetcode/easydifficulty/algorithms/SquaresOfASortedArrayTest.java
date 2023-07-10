package com.naveen.dsa.leetcode.easydifficulty.algorithms;

import com.naveen.dsa.leetcode.algorithms.twopointers.SquaresOfASortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest extends SquaresOfASortedArray {

    @Test
    void bruteforce1(){
        int[] nums = {-4,-1,0,3,10};
        int[] actual = bruteForce(nums);
        int[] expected = {0,1,9,16,100};

        double startTime = System.nanoTime();
        assertArrayEquals(actual, expected);
        double stopTime = System.nanoTime();
        System.out.println("Run time is "+(stopTime-startTime));
    }

    @Test
    void bruteForce2(){
        int[] nums = {-7,-3,2,3,11};
        int[] actual = bruteForce(nums);
        int[] expected = {4,9,9,49,121};

        double startTime = System.nanoTime();
        assertArrayEquals(actual, expected);
        double stopTime = System.nanoTime();
        System.out.println("Run time is "+(stopTime-startTime));;
    }

    @Test
    void secondApproach1(){
        int[] nums = {-4,-1,0,3,10};
        int[] actual = approach2(nums);
        int[] expected = {0,1,9,16,100};

        double startTime = System.nanoTime();
        assertArrayEquals(actual, expected);
        double stopTime = System.nanoTime();
        System.out.println("Run time is "+(stopTime-startTime));
    }

    @Test
    void secondApproach2(){
        int[] nums = {-7,-3,2,3,11};
        int[] actual = approach2(nums);
        int[] expected = {4,9,9,49,121};
        //System.out.println(Arrays.toString(expected) +" expected");
        //System.out.println(Arrays.toString(actual) +" actual");

        double startTime = System.nanoTime();
        assertArrayEquals(actual, expected);
        double stopTime = System.nanoTime();
        System.out.println("Run time is "+(stopTime-startTime));

    }

}