package com.naveen.dsa.leetcode.algorithms.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Naveen
 * @Description: Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * @link <a href="https://leetcode.com/problems/rotate-array/?envType=list&envId=erdkoq9t">...</a>
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7};
        int rotate = 3;
        rotateArray3(num, rotate);
        System.out.println(Arrays.toString(num));
    }

    /**
     * work in progress
     * @param num
     * @param k
     */
    public static void rotateArray3(int[] num, int k) {
        int leftPointer = k;
        int rightPointer = num.length-k;

        while(leftPointer < rightPointer && rightPointer<num.length){
            int temp = num[leftPointer];
            num[leftPointer++]=num[rightPointer];
            num[rightPointer++]=temp;
        }
    }

    /**
     * @Result: Failed
     * @Reason: I was rewriting the elements in new array but problem was expecting to modify the given array.
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] rotateArray2(int[] nums, int k){

        int leftPointer = 0;
        int[] result = new int[nums.length];
        int counter = 0;

        for (int i = nums.length-k; i < nums.length; i++) {
            result[counter++]=nums[i];
        }
        while (counter<nums.length){
            result[counter++]=nums[leftPointer];
            leftPointer++;
        }
        return result;
    }


    /**
     * @Result: FAILURE
     * @Result: This method is rejected because my interpretation of the question is wrong.
     * Instead of starting array with the num.length-rotate index, I started array with num.lenght-1 and went reverse
     *
     * @param nums
     * @param k
     * @return
     */
    public static int[] rotateArray(int[] nums, int k){

        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int[] result = new int[nums.length];
        int counter = 0;

        while(leftPointer <= rightPointer){
            if(rightPointer >= nums.length-k){
                result[counter]=nums[rightPointer];
                rightPointer--;
            } else {
                result[counter]=nums[leftPointer];
                leftPointer++;
            }
            counter++;
        }
        return result;
    }

}
