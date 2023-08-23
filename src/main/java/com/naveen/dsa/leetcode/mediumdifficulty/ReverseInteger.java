package com.naveen.dsa.leetcode.mediumdifficulty;

/**
 * @author <a href="mailto:naveenkumarerroju@gmailcom.com">Naveen Kumarer</a>
 * @description Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * @link <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
 */
public class ReverseInteger {

    /**
     * O(n) complexity. This solution beats 98.84% in runtime and 63& in memory. .
     *
     * @param num
     * @return
     */
    public int reverse(int num) {

        boolean negation = false;
        if (num < 0) {
            negation = true;
            num = -num;
        }

        long reversed = 0;
        int multiplier = 10;

        while (num > 0) {
            int reminder = num % 10;
            reversed = (reversed * 10) + reminder;
            multiplier *= 10;
            num /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) return 0;
        return negation ? (int) -reversed : (int) reversed;
    }


    /**
     * BruteForce algorithm. Bad runtime performance.
     * Beats 10.8% in rumtime and 63& in memory
     *
     * @param x
     * @return
     */
    public int reverseIntUsingStringBuilder(int x) {
        String s = Integer.toString(x);
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = c.length - 1; i >= 0; i--) {
            if (Character.isDigit(c[i])) {
                sb.append(c[i]);
            } else if (i == 0 && (c[i] == '-' || c[i] == '+')) {
                sb.insert(0, c[i]);
            }
        }

        long reverse = Long.parseLong(sb.toString());

        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.parseInt(sb.toString());

    }

}
