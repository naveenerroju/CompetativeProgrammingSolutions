package com.naveen.dsa.leetcode.mediumdifficulty;

/**
 * @author <a href="mailto:naveenkumarerroju@gmailcom.com">Naveen Kumarer</a>
 * @description You are given an m x n integer matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * You must write a solution in O(log(m * n)) time complexity.
 *
 * @link <a href="https://leetcode.com/problems/search-a-2d-matrix/">74. Search a 2D Matrix</a>
 */
public class SearchATwoDMatrix {


    /**
     * Must use Binary search algorithm.
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix.length-1;
        int mid = -1;
        while(left!=right){

            mid = left + (right - left) / 2;

            if(matrix[mid][0]==target) return true;
            else if(matrix[mid][0]<target && matrix[mid+1][0] > target) break;

        }

        return false;
    }

}
