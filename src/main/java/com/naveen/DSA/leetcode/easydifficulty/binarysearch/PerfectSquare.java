package com.naveen.DSA.leetcode.easydifficulty.binarysearch;

//Leetcode challange for binary search course

import java.math.BigDecimal;

public class PerfectSquare {

    public static void main(String[] args) {


        //System.out.println(efficientAlgo(3));
        //System.out.println(nativeAlgo(3));

        stressTest(50);

    }


    public static boolean efficientAlgo(int num) {

        if(num<=1){
            return true;
        }

        int low = 2;
        int high = num/2;

        while (low<=high){

            int mid = low+(high-low)/2;
            long square = (long)mid*(long)mid;

            if (square==num){
                return true;
            } else if(square>num){
                high=mid-1;
            }  else if(square<num){
                low = mid+1;
            }

        }

        return false;
    }


    public static boolean nativeAlgo(int num) {

        if(num<=1){
            return true;
        }

        int serial = 2;

        while (serial<=num/2){
            long square = (long)serial*(long)serial;
            if(square==num){
                return true;
            } else if (square>num){
                return false;
            }

            serial++;
        }

        return false;
    }

    public static void stressTest(int testcases){
        int testcase = 3;
        while (testcase<testcases){

            boolean nativeResult = nativeAlgo(testcase);
            boolean efficientResult = efficientAlgo(testcase);
            if(nativeResult==efficientResult){
                System.out.println("Test Passed with number "+testcase);
                testcase++;
            } else {
                System.out.println("Test failed at number "+testcase);
                break;
            }

        }
    }

}
