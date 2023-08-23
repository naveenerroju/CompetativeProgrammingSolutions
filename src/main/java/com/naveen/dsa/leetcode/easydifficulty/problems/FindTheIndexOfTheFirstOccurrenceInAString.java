package com.naveen.dsa.leetcode.easydifficulty.problems;

/**
 * @author <a href="mailto:naveeenkumarerroju@gmail.com">Naveeen Kumar</a>
 * @description Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * @link <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">28. Find the Index of the First Occurrence in a String</a>
 */
public class FindTheIndexOfTheFirstOccurrenceInAString {

    /**
     * O(n) complexity. Sliding window algorithm.
     * Beats 100% in runtime, 21.99% in memory.
     *
     * @param haystack Full string to search
     * @param needle   SubString to search
     * @return
     */
    public int strStr(String haystack, String needle) {

        if (haystack.equals(needle)) {
            return 0;
        }

        int needleSize = needle.length();

        for (int i = 0; i < haystack.length() - (needleSize - 1); i++) {
            String subStr = haystack.substring(i, i + needleSize);
            if (subStr.equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * O(n) complexity.
     * Deals 100% in runtime, 63.11% in memory.
     * This is only for reference purpose because its the default implementation in java.String
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStrDefault(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
