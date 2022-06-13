package com.naveen.DSA.leetcode.easydifficulty.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(approach2(arr, 3)));
    }


    //This could be same or worse than brute force approach. but it does the job done.
    public static int[] approach2(int[] nums, int k){
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

        return result;
    }

    public static int[] bruteForce(int[] nums, int k ){
        for(int i=1;i<=k; i++) {
            rotate(nums);
        }
        return nums;
    }
    //This is a supporting function for the rotateKtimes function.
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
}
