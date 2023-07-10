package com.naveen.dsa.leetcode.easydifficulty.binarysearch;

// this problem could be solved in binary search in each array of matrix but my solution is already 100% fast. so i left it be.

public class CountNegativeNumbersInSortedMatrix {

    public static void main(String[] args) {
        int[][] grid = {
                {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}
        };
        int[][] grid2 = {{3,2},{1,0}};
        //System.out.println(solution(grid));     //expected 8
        System.out.println(solution(grid2));     //expected 0
    }

    public static int solution(int[][] grid) {

        int negatives = 0;

        for (int i = 0; i < grid.length; i++) {
            int j = 0;
            while (grid[i][j] >= 0){
                j++;
                if(grid[i].length<=j){      //to avoid index out of bound exception. if j goes out of range, it will throw exception at while condition.
                    break;
                }
            }
            negatives += grid[i].length - j;

        }

        return negatives;
    }




    public static int bruteForce(int[] [] grid){
        int negatives = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j]<0){
                    negatives++;
                }
            }
        }
        
        return negatives;
    }
}
