package com.naveen.dsa.leetcode.easydifficulty.binarysearch;

//problem number 1539
/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
*/

public class KthMissingPositiveNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(bruteForce(arr, 5));     //expected 9
    }

    public static void findKthPositiveNumber(int[] arr){

    }

    public static int bruteForce(int[] arr, int k){

        int low = 0;
        int high = arr.length-1;

        while(low<=high){

            int mid = low+(high-low)/2;

            if(arr[mid]==mid+1){
                low = mid+1;
            } else if(arr[mid]>mid+1){
                if((mid+1)-arr[mid]==k)
                    return mid+1;
                else if((mid+1)-arr[mid]>k)
                    high=mid-1;
            }
        }

        return -1;
    }
}
