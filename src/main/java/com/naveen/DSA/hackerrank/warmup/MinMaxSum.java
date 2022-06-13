package com.naveen.DSA.hackerrank.warmup;

/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
*/


import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(500);
        list.add(500);

        miniMaxSum(list);
    }

    public static void miniMaxSum(List<Integer> arr) {


        int shortestIndex = 0;
        int largestIndex = 0;
        for(int e: arr){
            int currentIndex = arr.indexOf(e);
            if(e<arr.get(shortestIndex))
                shortestIndex=arr.indexOf(e);
            if(e>arr.get(largestIndex))
                largestIndex=arr.indexOf(e);
        }

        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(i!=shortestIndex){
                max+=arr.get(i);
            }
            if(i!=largestIndex){
                min+=arr.get(i);
            }
        }

        System.out.println(min+" "+max);

    }


    public static void failedSolution(List<Integer> arr) { //with values, but if values are duplicates, then they are all ignored

        int shortest = arr.get(0);
        int largest = arr.get(0);
        for(int e: arr){
            if(e<shortest)
                shortest=e;
            if(e>largest)
                largest=e;
        }

        int min = 0;
        int max = 0;

        for(int e: arr){
            if(e!=shortest){
                max+=e;
            }
            if(e!=largest){
                min+=e;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
