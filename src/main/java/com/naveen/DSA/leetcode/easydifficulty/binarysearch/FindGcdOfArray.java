package com.naveen.DSA.leetcode.easydifficulty.binarysearch;

//LEETCODE CHALLENGE, used basic approach for finding gcd.

import java.lang.Math;

public class FindGcdOfArray {

    public static void main(String[] args) {
        int[] arr = {2,5,6,9,10};
        System.out.println(findGCD(arr));
    }

    public static int findGCD(int[] nums) {

        int smallest = nums[0];
        int largest = nums[0];

        //finding smallest and largest values
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
            } else if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        int gcd = gcd(smallest, largest);


        return gcd;
    }

    public static int gcd(int a, int b) {
        int gcd = 0;
        int smallest = Math.min(a, b);
        for (int i = 1; i <= smallest; i++) {
            if (a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}


