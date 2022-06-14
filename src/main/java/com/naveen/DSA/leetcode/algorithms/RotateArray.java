package com.naveen.DSA.leetcode.algorithms;
//Not solved yet! need a faster solution.
import java.util.Arrays;

public class RotateArray {

    //37/38 testcases passed. test cased failed due to time limit exceeded.
    public int[] rotateArray(int[] nums, int k) {
        for(int i=1;i<=k; i++) {
            rotate(nums);
        }
        return nums;
    }
    //both functions work on a single task
    public static int[] rotate(int[] nums) {

        int temp = nums[nums.length - 1];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == 0) {
                nums[i] = temp;
            } else {
                nums[i] = nums[i - 1];
            }
        }
        return nums;
    }

    public int[] rotateArraySlow(int[] nums, int k) {
        int[] result = new int[nums.length];
        int nextIndex = 0;

        int[] secondHalf = Arrays.copyOfRange(nums, nums.length-k,nums.length);
        int[] firstHalf = Arrays.copyOfRange(nums, 0,nums.length-k);

        for (int i = 0; i < secondHalf.length; i++) {
            result[nextIndex++]=secondHalf[i];
        }
        for (int i = 0; i < firstHalf.length; i++) {
            result[nextIndex++]=firstHalf[i];
        }
        nums = Arrays.copyOf(result,result.length);
        return nums;
    }
}
