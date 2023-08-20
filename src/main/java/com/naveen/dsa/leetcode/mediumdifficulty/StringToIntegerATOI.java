package com.naveen.dsa.leetcode.mediumdifficulty;

import java.math.BigInteger;

/**
 * @author Naveen Kumar <a href="mailto:naveenkumarerroju@gmail.com">
 * @link https://leetcode.com/problems/string-to-integer-atoi/description/
 * @Description Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 */
public class StringToIntegerATOI {

    public static void main(String[] args) {
        System.out.println(toInteger("-123 wirds 23"));
        System.out.println(toInteger("43"));
        System.out.println(toInteger("-+43"));
        System.out.println(toInteger("words -123 wirds 23"));
        System.out.println(toInteger("-91283472332")); // expected: -2147483648
    }

    /**
     * @param value
     * @return
     * @description My solution
     */
    public static int toInteger(String value) {
        value = value.trim();
        StringBuilder sb = new StringBuilder();
        char[] chars = value.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isDigit(c) || (i == 0 && (c == '-' || c == '+'))) {
                sb.append(c);
            } else if (sb.isEmpty()) {
                return 0;
            } else {
                break;
            }
        }

        BigInteger answer = new BigInteger(sb.toString());

        if (answer.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        } else if (answer.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        } else {
            return answer.intValue();
        }
    }

    /**
     * @param s
     * @return
     * @description This solution is copied from solutions section. Couldn't work to the precise logic.
     */
    public int solutionAtoi(String s) {
        s = s.trim();
        StringBuilder st = new StringBuilder();
        char[] arr = s.toCharArray();

        if (s.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i]) || (i == 0 && (arr[i] == '-' || arr[i] == '+'))) {
                st.append(arr[i]);
            } else {
                break;
            }
        }

        if (st.length() == 0 || (st.length() == 1 && (st.charAt(0) == '-' || st.charAt(0) == '+'))) {
            return 0;
        }

        BigInteger result = new BigInteger(st.toString());

        if (result.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        } else if (result.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        }

        return result.intValue();
    }

}
