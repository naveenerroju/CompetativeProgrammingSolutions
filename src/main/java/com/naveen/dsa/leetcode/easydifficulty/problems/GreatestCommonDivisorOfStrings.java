package com.naveen.dsa.leetcode.easydifficulty.problems;

/**
 * @description For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 * @link <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/?envType=list&envId=erdkoq9t">1071. Greatest Common Divisor of Strings</a>
 */
public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        String str1 = "ABCDABC";
        String str2 = "0";

        System.out.println(gcdOfStrings(str1, str2));
    }


    /**
     * This method is first attempt but not the accepted solution since this will not work properly for duplicate substrings in the string
     * For example: if the str2 is ABAB, and the str1 is ABABCABAB then solution is ABAB.
     * However, leetcode wants the solution to be AB only because it doens't want the duplicates in the substring.
     *
     * @param str1 longest string
     * @param str2 shortest string
     * @return GCD of string
     */
    public static String gcdOfStrings(String str1, String str2) {
        String str1Sub = str1.substring(0, str2.length());

        while(str2.length()>0 && str1Sub.length()>0 && !str1Sub.equals(str2)){
            str1Sub = str1Sub.substring(0, str1Sub.length()-1);
            str2 = str2.substring(0, str2.length()-1);
        }

        return str1Sub;
    }

}
