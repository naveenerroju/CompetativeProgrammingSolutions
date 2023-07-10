package com.naveen.dsa.leetcode.easydifficulty.binarysearch;

//LEETCODE CHALLENGE IN BINARY SEARCH COURSE

public class InsertPosition {

    public int searchInsert(int[] nums, int target) {   // O(log n)

        int low = 0;
        int high = nums.length-1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(nums[mid]>target)
                high=mid-1;
            else if(nums[mid]<target)
                low = mid+1;
            else {
                return mid;
            }

        }
        return low;
    }

    public static int bruteForce(int[] nums, int target){

        if (target<nums[0]){
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target || nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }

}
