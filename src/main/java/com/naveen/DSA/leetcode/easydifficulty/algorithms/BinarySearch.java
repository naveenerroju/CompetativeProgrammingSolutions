package com.naveen.DSA.leetcode.easydifficulty.algorithms;

public class BinarySearch {

    public int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]<target)
                low = mid+1;
            else if(nums[mid]>target)
                high = mid-1;
            else
                return mid;

        }
        return -1;

    }

    public int linearScan(int[] nums, int target){
        for(int i=0; i<nums.length;i++){
            if(nums[i]==target)
                return i;
        }
        return -1;
    }

}
