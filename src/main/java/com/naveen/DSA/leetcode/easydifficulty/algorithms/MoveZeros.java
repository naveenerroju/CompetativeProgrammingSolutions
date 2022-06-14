package com.naveen.DSA.leetcode.easydifficulty.algorithms;

//topic: Two points
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/


import java.util.Arrays;

public class MoveZeros {

    public static int[] solution(int[] nums){


        return nums;
    }

    public static int[] bruteForce(int[] nums){

        if(nums.length<=1)
            return nums;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==0){
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]!=0){ //0
                        nums[i] = nums[j];    //non zero
                        nums[j]=0;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
