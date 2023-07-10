package com.naveen.dsa.leetcode.easydifficulty.binarysearch;

//LEETCODE PROBLEM IN BINARY SEARCH COURSE

/*

Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j]
where |arr1[i]-arr2[j]| <= d.

*/


import java.util.Arrays;

import static java.lang.Math.abs;

public class FindDistanceValueBtwnTwoArrays {


    public static int effectiveImplementation(int[] arr1, int[] arr2, int d){

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int distace = arr1.length;

        //perform binary search here

        return distace;
    }


    // O(n1*n2)
    public static int bruteImplementation(int[] arr1, int[] arr2, int d) {

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            int temp = 0;
            for (int j = 0; j < arr2.length; j++) {

                int result = abs(arr1[i]-arr2[j]);

                if(result <= d){
                    temp++;
                }
            }
            if(temp==0){
                count++;
            }
        }

        return count;
    }

}
