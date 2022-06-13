package com.naveen.DSA.leetcode.easydifficulty;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
//using two pointers (a famous method of this famous problem)

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    //One Pass method uses the HashMap
    //Instead of checking all the possibilities, we can use HashMap and see if the current value i => target-i = k => if k is present in the map, then we return i and k.

    public static int[] onePassMethod(int[] nums, int target){
        HashMap<Integer, Integer> data = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(data.containsKey(target-nums[i])){
                return new int[] {data.get(target-nums[i]), i};
            }

            data.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }


    public static int[] twoPointers(int[] nums, int target){
        //There is a problem witht this solution. this works fine for most cases except some cases in leetcode. So this is not the best for all the scenarios.
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
