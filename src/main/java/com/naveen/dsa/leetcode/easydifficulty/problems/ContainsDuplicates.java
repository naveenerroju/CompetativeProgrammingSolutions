package com.naveen.dsa.leetcode.easydifficulty.problems;

import java.util.HashSet;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">Naveen Kumarer</a>
 * @description 217. Contains Duplicate. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * @link <a href="https://leetcode.com/problems/contains-duplicate/description/">217. Contains Duplicate</a>
 */
public class ContainsDuplicates {


    /**
     * This algorithm does not work for really long arrays in leetcode. Because of time constraints.
     *
     * @param nums
     * @return
     */
    public boolean solutionUsingTwoPointers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Beats 88.5% in runtime and beats 98.33 in Memory
     */
    public boolean solutionUsingHashSet(int[] nums) {
        HashSet<Integer> hashset = new HashSet<>();
        for (int num : nums) {
            if (hashset.contains(num)) {
                return true;
            } else {
                hashset.add(num);
            }
        }

        return false;
    }
}
