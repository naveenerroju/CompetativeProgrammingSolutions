package com.naveen.DSA.leetcode.algorithms.twopointers;

//this algorithm has bugs. it is throwing errors in some cases.
//work on it again in a fresh mind.

import java.util.Arrays;

public class SquaresOfASortedArray {
/*

    public static void main(String[] args) {
        int[] array = {-4,-1,0,3,10};
        int[] array2 = {-7,-3,2,3,11};

        twoPointerApproach1(array);     //[0,1,9,16,100]
        twoPointerApproach1(array2);    //[4,9,9,49,121]
    }
*/

    public static int[] twoPointerApproach1(int[] nums){

        int result[] = new int[nums.length];
        int currentIndex = 0;   //next index in result array that needs to be filled.
        int mid = 253679;   //first non-negative integer index in array

        //searching the first non-negative integer index
        for(int i=0; i<nums.length;i++){
            if(nums[i]>=0) {
                mid=i;
                break;
            }
        }

        int low = mid-1;    //last negative integer index in array
        int high = mid;     //first non-negative integer index in array

        //this loop will break not completing all the elements sometimes. usually when array length is odd number.
        while (low>=0 && high<nums.length){

            int leftSquare = nums[low]*nums[low];
            int rightSquare = nums[high]*nums[high];

            if(leftSquare<rightSquare){
                result[currentIndex]=leftSquare;
                low--;
            } else {
                result[currentIndex]=rightSquare;
                high++;
            }
            currentIndex++;
        }

        //when right index are finished but left index are there.
        while (low>=0){
            result[currentIndex++]=nums[low]*nums[low];
            low--;
        }
        //when left indexes are finished but right indexes are there.
        while (high<nums.length){
            result[currentIndex++]=nums[high]*nums[high];
            high++;
        }

        return result;

    }

    public static int[] approach2(int[] nums){

        int low = 0, high = nums.length-1;

        while (low<high){
            nums[low]=nums[low]*nums[low];
            nums[high]=nums[high]*nums[high];
            low++;
            high--;
        }
        if(low==high)
            nums[low]*=nums[low];

        Arrays.sort(nums);
        return nums;
    }

    public static int[] bruteForce(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }

        Arrays.sort(nums);      //although we did only 1 loop. This function also does a loop. It follows, dual pivot quick sort. O(n log n) complexity

        return nums;
    }

}
