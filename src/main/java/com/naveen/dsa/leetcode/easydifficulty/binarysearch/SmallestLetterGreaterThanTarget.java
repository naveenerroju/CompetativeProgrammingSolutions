package com.naveen.dsa.leetcode.easydifficulty.binarysearch;

//LEETCODE challange for binary search
//The actual problem will give sorted array itself. but i have sorted in function for my testing purpose.

import java.util.Arrays;

public class SmallestLetterGreaterThanTarget {

    public static char solution(char[] charArray, char target) {

        Arrays.sort(charArray); //optional if array is already sorted

        //finding element/solution
        for(char e: charArray){
            if(e>target){
                return e;
            }
        }

        return charArray[0];

    }
}
