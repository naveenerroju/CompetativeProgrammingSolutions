package com.naveen.dsa.leetcode.easydifficulty.problems;
import java.util.Arrays;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">Naveen Kumar</a>
 * @decription 26. Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * this is optimized code. copied from solutions.
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    /**
     * This is a bruteForce method. Beats 5% in runtime and 61.5% in memory.
     *
     * @param nums
     * @return
     */
    public int removeDuplicatesUsingTwoPointer(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            while (nums[i] >= nums[j] && j < nums.length - 1) j++;
            nums[i + 1] = nums[j];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[nums.length - 1]) {
                return i + 1;
            }
        }

        return 1;
    }

}
