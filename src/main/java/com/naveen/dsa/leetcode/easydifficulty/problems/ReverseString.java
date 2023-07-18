package com.naveen.dsa.leetcode.easydifficulty.problems;

import java.util.Arrays;

/**
 * @author Praneetha
 *
 * @description Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 */
public class ReverseString {

    public static void main(String[] args) {

        char[] array = {'h','e','l','l','o'};
        System.out.println(Arrays.toString(reverseString(array)));

    }

    public static char[] reverseString(char[] s){
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i]=s[s.length-(i+1)];
            s[s.length-(i+1)]=temp;
        }

        return s;
    }


}
