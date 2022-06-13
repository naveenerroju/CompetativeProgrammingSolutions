package com.naveen.DSA.leetcode.easydifficulty;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
//using two pointers (a famous method of this famous problem)

import java.util.Arrays;

public class TwoSum {

    public static int[] twoPointers(int[] nums, int target){
        int[] result = {-1,-1};

        int low= 0;
        int high = nums.length-1;

        while (low<=high){

            if(nums[low]+nums[high]>target){
                high--;
            } else if(nums[low]+nums[high]<target){
                low++;
            } else {
                return new int[] {low, high};
            }
        }

        return result;
    }

    public int[] bruteForce(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i<=nums.length-1;i++){
            for (int j=0; j<= nums.length-1; j++){
                if(nums[j]+nums[i]==target&&i!=j){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
}
