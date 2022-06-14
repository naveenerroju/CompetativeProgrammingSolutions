package com.naveen.DSA.leetcode.algorithms;

//problem number 167
//All the solutions I came up with or found explanations are accepted but couldnt beat atleast 10% of the submissions in run time. The most optimised O(n) solution is using vectors.
//But currently I'm not learning data structures(Vectors especially) at the moments so I'm leaving it there.
/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.

*/

import java.util.HashMap;

public class TwoPointer2 {

    public static int[] hashCodeApprach(int[] numbers, int target){
        HashMap<Integer, Integer> data = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            if(data.containsKey(target-numbers[i])){
                return new int[] {data.get(target-numbers[i]), i};
            }

            data.put(numbers[i], i);
        }
        return new int[] {-1,-1};
    }

    public static int[] diffApproach(int[] numbers, int target){

        int solution[] = new int[2];
        if(numbers==null||numbers.length<2) return solution;

        int one = 0, two = numbers.length-1;

        while (one<two){
            //int mid = one+two/2;
            int result = numbers[one]+numbers[two];
            if(result==target){
                solution[0] = one+1;
                solution[1] = two+1;
                return solution;
            } else if(result>target) {
                two--;
            } else {
                one++;
            }

        }

        return solution;
    }

    public static int[] solution(int[] numbers, int target){

        int[] result = {-1,-1};

        for (int i = 0; i < numbers.length; i++) {

            int low = i+1;
            int high = numbers.length-1;

            while (low<=high) {
                int mid = low+(high-low)/2;
                if (numbers[i] + numbers[mid] < target) {
                    low=mid+1;
                } else if(numbers[i]+numbers[mid]>target) {
                    high=mid-1;
                } else {
                    result[0]=++i;
                    result[1]=++mid;
                    return result;
                }
            }
        }

        return result;
    }
}
