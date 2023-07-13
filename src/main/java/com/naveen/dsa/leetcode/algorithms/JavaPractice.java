package com.naveen.dsa.leetcode.algorithms;

import java.awt.*;
import java.net.StandardSocketOptions;

/**
 * @author Praneetha
 * @Description this is a trash class please ignore
 */
public class JavaPractice {
    public static void main(String[] args) {
        int[] arr = {10,12,0,-2,-4,5};
        int[] newArr = sortingArrayInteger(arr);
        for (int num : newArr)
        {
            System.out.println(num);
        }

    }

    /**
     * Given an array of integers, sort them in ascending order and return the new sorted array.
     * Test cases will contain negative integers and zeros.
     *
     * @param nums
     */
    public static int[] sortingArrayInteger(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (nums[j-1] > nums[j])
                {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}

