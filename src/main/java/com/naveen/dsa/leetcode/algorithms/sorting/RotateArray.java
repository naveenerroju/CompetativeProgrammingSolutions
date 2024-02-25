package com.naveen.dsa.leetcode.algorithms.sorting;
//Not solved yet! need a faster solution.
import com.naveen.utils.ArraysUtility;

import java.util.Arrays;

public class RotateArray {

    /**
     * Beats 35.27% of users with Java  in Runtime
     * Beats 64.28% of users with Java
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {

        if(nums.length<2){
            return;
        }

        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }

        //reverse entire array
        ArraysUtility.reverseSubString(nums, 0, nums.length-1);

        //reverse 0 to nums.length-k
        ArraysUtility.reverseSubString(nums, 0, k-1);

        //reverse nums.length-k to nums.length
        ArraysUtility.reverseSubString(nums, k, nums.length-1);

    }

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
