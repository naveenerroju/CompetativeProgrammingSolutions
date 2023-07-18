package com.naveen.dsa.leetcode.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Naveen Kumar
 * @link <a href="https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/">...</a>
 * @tags sorting
 *
 * @description You are given a positive integer num consisting of exactly four digits.
 * Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 */
public class MinimumSumofFourDigitNumberAfterSplittingDigits {

    public static void main(String[] args) {
        System.out.println(solution(2932));
    }

    /**
     * This is the best solution that beats 100% of the submissions in runtime while it beats 48% in memory
     *
     * @param num
     * @return
     */
    public static int solution(int num) {

        int[] digits = new int[4];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = num % 10;
            num/=10;
        }
        Arrays.sort(digits);

        int shortestSum = (digits[0]*10)+digits[2];
        int largeSum = (digits[1]*10)+digits[3];

        return shortestSum+largeSum;
    }

}
