package com.naveen.dsa.leetcode.algorithms.slidingwindow;

/**
 * @author Naveen Kumar
 * @description You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 */
public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
//        int result = characterReplacement("AABEAFACAAEAA", 1);
//        System.out.println(result==4?"Test Passed": "Test Failed. Result is "+result);
        String mystr = "x";
        System.out.println(mystr=="x");

    }

    /**
     * My idea: My idea is to get substring that can have k number of other chars other than most common chars.
     * then we can replace the minority chars with the most common character.
     * @param s
     * @param k
     * @return
     */
    public static int characterReplacement(String s, int k) {

        char[] elements = s.toCharArray();
        int maxLengthAfterReplacment = 0;
        for (int i = 0; i < elements.length-1; i++) {
            int noOfErrors = 0;
            int end = 1;
            while (noOfErrors > k) {
                String subStringWindow = s.substring(s.charAt(i), s.charAt(1+end));
                int maxErrorsInWindow = getMaxLengthAfterReplacement(subStringWindow);
                if(maxErrorsInWindow>maxLengthAfterReplacment){
                    maxLengthAfterReplacment = maxErrorsInWindow;
                } else {
                    end++;
                }
            }
        }

        return maxLengthAfterReplacment;
    }

    /**
     * this method will take a string and returns the maximum number of errors in the string.
     * if it is not large enough thne returns the provided maximum number of errors.
     *
     * @param s
     * @return
     */
    private static int getMaxLengthAfterReplacement(String s){

        int counter = 0;
        for (int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                counter++;
            }
        }

        return counter;
    }
}
