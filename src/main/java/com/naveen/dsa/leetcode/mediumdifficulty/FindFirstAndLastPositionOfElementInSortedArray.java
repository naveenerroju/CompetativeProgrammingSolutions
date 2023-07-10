package com.naveen.dsa.leetcode.mediumdifficulty;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example: Input: nums = [5,7,7,8,8,10], target = 8
         Output: [3,4]
*/

    public static void main(String[] args) {
        int[] array = {5,7,7,8,8,10};

        System.out.println(Arrays.toString(searchRange(array, 7)));   //expected [3,4]
    }


    public static int[] searchRange(int[] nums, int target) {

        int[] result = {-1,-1};

        if(nums.length == 0){
            return  result;
        }
        if (nums.length==1 && nums[0]==target){
            return new int[] {0,0};
        }

        int low = 0;
        int high = nums.length;

        while (low<=high){

            int mid = low+(high-low)/2;

            if(mid>target){
                low= mid+1;
            } else if(mid<target) {
                high=mid-1;
            }

        }

        return result;
    }

    public static int[] bruteForce(int[] nums, int target){

        int[] result = {-1,-1};

        if(nums.length == 0){
            return  result;
        }
        if (nums.length==1 && nums[0]==target){
            return new int[] {0,0};
        }

        for (int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                result[0] = i;
                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]!=target){
                        result[1]=j-1;
                        return result;
                    }
                }
            }
        }

        return result;
    }


}
