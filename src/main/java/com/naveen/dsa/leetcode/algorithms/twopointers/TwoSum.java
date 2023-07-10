package com.naveen.dsa.leetcode.algorithms.twopointers;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> data = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(data.containsKey(target-nums[i])){
                return new int[] {data.get(target-nums[i]), i};
            }

            data.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }


    private static int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
