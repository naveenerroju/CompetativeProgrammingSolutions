package com.naveen.dsa.leetcode.easydifficulty.problems;

import java.util.Arrays;

/**
 * @author Praneetha
 *
 */
public class SortingTheSentence {


    public static void main(String[] args) {

        sortTheSentense("me3 This1 writing4 is2");

    }

    public static void sortTheSentense(String sentence){

        String[] words = sentence.split(" ");
        String[] result = new String[words.length];

        for (String word: words) {
            int order = Integer.parseInt(String.valueOf(word.charAt(word.length()-1)))-1;
            result[order]=word.substring(0,word.length()-1);
        }

        System.out.println(String.join(" ",result));
    }

}
