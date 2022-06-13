package com.naveen.DSA.leetcode.easydifficulty.binarysearch;

import com.naveen.GenerateRandomArrayList;

import java.util.ArrayList;

public class MountainArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,2,1};
        System.out.println(peakIndexMountainArrayBinary(array));    //answer: 3

    }

    public static int peakIndexMountainArrayBinary(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while (low<high){
            int mid = low+(high-low)/2;

            if (arr[mid] > arr[mid]+1){
                high = mid-1;
            } else {
                low = mid;
            }

        }

        return low;
    }

    //linear scan implementation
    public static int peakIndexInMountainArray(int[] arr){

        int i = 0;
        while (arr[i]<arr[i+1]){
            i++;
        }

        return i;

    }





    public int solution(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }

}
