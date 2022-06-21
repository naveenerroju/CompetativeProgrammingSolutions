package com.naveen.DSA.leetcode.algorithms.twopointers;

//topic: Two points
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/


import java.util.Arrays;

public class MoveZeros {

    public static int[] solution(int[] nums){       // O(n)

        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        while (insertPosition<nums.length){
            nums[insertPosition]=0;
            insertPosition++;
        }

        return nums;
    }


    //Although this is a simple solution, leetcode made it sure that it wont accept solutions that are using different arrays.
    //we must use the same array they provided. because we are not returning anything inside the leetcode editor.
    //returning is only for my convenience for easy testing.
    // THIS IS NOT A SPACE EFFICIENT METHOD. BECAUSE WE ARE CREATING ANOTHER COPY OF ARRAY.
    public static int[] alternateApproach(int[] nums){

        int[] copy = new int[nums.length];
        int copyInd = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                copy[copyInd] = nums[i];
                copyInd++;
            }
        }

        return copy;
    }

    public static int[] bruteForce(int[] nums){         // O(n^2)

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
