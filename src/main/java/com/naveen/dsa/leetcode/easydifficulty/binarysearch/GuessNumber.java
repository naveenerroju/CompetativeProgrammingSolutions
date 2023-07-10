package com.naveen.dsa.leetcode.easydifficulty.binarysearch;

//LEETCODE CHALLENGE IN BINARY SEARCH COURSE

public class GuessNumber {

    public static int answer = 1000;
    public static int n = 2147483646; // 2147483646 range of integer is 2,147,483,647

    public static void main(String[] args) {
        System.out.println(guessWithTernery(n));
    }

    public static int guessWithBinary(int n) {

        int low = 1;
        int high = n;

        while (low<=high){

            int mid = (low+high)/2;
            int result = guess(mid);

            if (result<0) {
                low=mid+1;
            } else if (result>0) {
                high = mid-1;
            } else {
                return mid;
            }
        }

        return -1;

    }

    public static int guessWithBruteForce(int n){
        for (int i=1;i<=n;i++){
            if (i==answer){
                return i;
            }
        }
        return -1;
    }

    public static int guessWithTernery(int n){
        int low = 1;
        int high = n;

        while (low<=high){

            int mid1 = low+(high-low)/3;
            int mid2 = high-(high-low)/3;

            int mid1result = guess(mid1);
            int mid2result = guess(mid2);

            if (mid1result==0){
                return mid1;
            }
            else if(mid2result==0){
                return mid2;
            }
            else if (mid1result<0){
                low=mid1+1;
            }
            else if (mid2result>0){
                high=mid2-1;
            }
            else {
                low = mid1+1;
                high = mid2-1;
            }

        }

        return -1;

        //but ternary search is worse than binary search. It is advicible to use binary search.
    }

    //recursion implementation is not properly done. have to learn how to use recursion more in depth.
    public static int guessWithBinaryRecursion(int start, int end){

        int mid = (start+end)/2;
        int result = guess(mid);

        if(result == -1){
            guessWithBinaryRecursion(mid+1, end);
        } else if (result == 1){
            guessWithBinaryRecursion(start, mid-1);
        } else {
            return mid;
        }

        return mid;
    }

    //this is the function that gives the hint
    public final static int guess(int guessedNumber){

        /*
         * Forward declaration of guess API.
         * param  num   your guess
         * return 	     -1 if num is higher than the picked number.... then mid should be next low
         *			      1 if num is lower than the picked number.... then mid should be next high
         *               otherwise return 0
         * int guess(int num);
         */

        if (guessedNumber>answer){
            return 1;
        } else if (guessedNumber<answer){
            return -1;
        } else {
            return 0;
        }
    }

}
