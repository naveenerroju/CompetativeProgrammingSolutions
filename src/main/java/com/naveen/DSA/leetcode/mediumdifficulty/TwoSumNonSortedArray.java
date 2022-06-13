package com.naveen.DSA.leetcode.mediumdifficulty;

/*

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.

*/

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumNonSortedArray {
/*

    public static void main(String[] args) {

        int[] array = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};

        boolean result = Arrays.equals(expected, solution(array,target));
        System.out.println("Expected: "+Arrays.toString(expected));
        System.out.println("Actual: "+Arrays.toString(solution(array,target)));


    }
*/


    public static int[] solution(int[] numbers, int target){

        int solution[] = new int[2];
        int one = 0, two = numbers.length-1;
        if(numbers==null||numbers.length<2) return solution;


        while (one<two){

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


    public static int[] myFailedTerribleSolution(int[] numbers, int target) {

        int[] solution = new int[2];

        //since the array is sorted, we can create a sub array of values that are less than target.
        ArrayList<Integer> list = new ArrayList<>();

        if(numbers.length==2){
            return new int[] {1,2};
        }

        for(int e: numbers){
            list.add(e);
        }

        if(numbers.length>2){
            for(int i=0;i<list.size();i++){
                for(int j = i+1; j<list.size();j++){
                    int a = list.indexOf(list.get(i));
                    int b = list.indexOf(list.get(j));
                    if(list.get(j)+list.get(i)==target && a!=b){
                        solution[0]=a+1;
                        solution[1]=b+1;
                        return solution;
                    }
                }
            }
        }


        return solution;
    }

}

/*

Constraints:

        2 <= numbers.length <= 3 * 104
        -1000 <= numbers[i] <= 1000
        numbers is sorted in non-decreasing order.
        -1000 <= target <= 1000
        The tests are generated such that there is exactly one solution.
*/
