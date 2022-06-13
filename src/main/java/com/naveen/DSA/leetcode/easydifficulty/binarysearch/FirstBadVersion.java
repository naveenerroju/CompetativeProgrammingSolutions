package com.naveen.DSA.leetcode.easydifficulty.binarysearch;

/*
*
* You are a product manager and currently leading a team to develop a new product. Unfortunately,
* the latest version of your product fails the quality check. Since each version is developed based on the previous version,
* all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version.
* You should minimize the number of calls to the API.
*
*/

import java.util.Random;

public class FirstBadVersion {

    public static int firstBadVersion(int n) {
        int firstVersion = 0;

        //using binary search
        int low = 0; //when i gave low = 1. stress test failed when the expected output was 0.
        int high = n;

        while (low<=high){

            int mid = low+(high-low)/2; //to avoid overflow

            if(isBadVersion(mid)){
                firstVersion=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }

        }

        return firstVersion;
    }

/*--------------------------------------------------------------------------------------------------------*/


    //to store the badversion globally. so it can be accessed by isBadVersion() and firstBadVersion()
    public static int badversion = 0;

    //for the solution function to check if the estimated version is bad version
    public static boolean isBadVersion(int n){
        return n >= badversion;
    }

    //stress test  that randomly generates testcases.
    private static void stressTest(){

        //Enter number of testcases here
        int numberOfTests = 100000;

        Random random = new Random();
        int tests = 1;  //tests start from here

        while (tests<=numberOfTests){


            int versions = random.nextInt(Integer.MAX_VALUE-1);
            //adding max range bound, so it will start from zero and won't give negative values

            int actual = firstBadVersion(versions);

            if(actual==badversion){
                System.out.println("Test case "+tests+" passed!");
            } else {
                System.out.println("Test case failed!");
                System.out.println("Versions: "+versions+". expected FirstBadVerion: "+badversion);
                System.out.println("Actual FirstBadVersion: "+actual);
                break;
            }
            tests++;
        }

    }

}
