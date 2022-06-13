package com.naveen.DSA.hackerrank.warmup;
/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.
1 2 3
4 5 6
9 8 9

The left-to-right diagonal = 1+5+9=15 The right to left diagonal = 3+5+9=17. Their absolute difference is 15-17=2.
*/

import java.util.ArrayList;
import java.util.List;

public class SumOfDiagonals {

    public static void main(String[] args) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        arr1.add(11);
        arr1.add(2);
        arr1.add(4);
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        arr3.add(10);
        arr3.add(8);
        arr3.add(-12);

        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        /*
        11 2  4
        4  5  6
        10 8 -12
        */

        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {

        int sum1 = 0;

        //Left diagonals
        for(int i =0; i<arr.size(); i++) {
            sum1+=arr.get(i).get(i);
        }

        //Right diagonals
        for(int i =0; i<arr.size(); i++) {
            sum1-=arr.get(i).get(arr.size()-i-1); //left diagonal - right diagonal
        }

        return sum1<0 ? sum1*(-1) : sum1;
    }

}