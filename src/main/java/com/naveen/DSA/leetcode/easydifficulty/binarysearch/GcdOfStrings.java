package com.naveen.DSA.leetcode.easydifficulty.binarysearch;

//I have been able to find the common divisor of the given strings but that is not the greatest.
// it can be cut down to shorter. For example ABAB is the common divisor my program detects.
// But the greatest common divisor is AB. Since it is repeated. it should be GCD.

import java.util.StringTokenizer;

public class GcdOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
    }

    public static String gcdOfStrings(String str1, String str2) {

        String gcd = "";

        String shortest = str1.length()<str2.length() ? str1 : str2;
        String longest = str1.length()>str2.length() ? str1 : str2;
        longest = longest.substring(0,shortest.length());

        for (int i = shortest.length(); i >= 0; i--) {

            if(shortest.length()==0||longest.length()==0){
                break;
            }
            if (shortest.equals(str2)) {
                gcd = shortest;
            }

            shortest = shortest.substring(0, shortest.length() - 1);
            longest = longest.substring(0, longest.length() -1);
        }

        return gcd;
    }

}
