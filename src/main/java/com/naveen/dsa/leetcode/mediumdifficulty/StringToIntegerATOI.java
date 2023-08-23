package com.naveen.dsa.leetcode.mediumdifficulty;

import java.math.BigInteger;

/**
 * @author Naveen Kumar <a href="mailto:naveenkumarerroju@gmail.com">
 * @link https://leetcode.com/problems/string-to-integer-atoi/description/
 * @Description Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 */
public class StringToIntegerATOI {

    /**
     * @description This is more efficient than using BigInteger. (solution is copied)
     * @param s
     * @return
     */
    public int optimisedATOI(String s) {
        s = s.strip();
        if (s.isEmpty())
            return 0;

        final int sign = s.charAt(0) == '-' ? -1 : 1;
        if (s.charAt(0) == '+' || s.charAt(0) == '-')
            s = s.substring(1);

        long num = 0;

        for (final char c : s.toCharArray()) {
            if (!Character.isDigit(c))
                break;
            num = num * 10 + (c - '0');
            if (sign * num <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            if (sign * num >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }

        return sign * (int) num;
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
