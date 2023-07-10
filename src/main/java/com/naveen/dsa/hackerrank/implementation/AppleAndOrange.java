package com.naveen.dsa.hackerrank.implementation;

//the problem is long
//https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

    public static void main(String[] args) {
        int houseStart = 7;
        int houseEnd = 11;
        int appleTree = 5;
        int orangeTree = 15;

        ArrayList<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);

        ArrayList<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);

        countApplesAndOranges(houseStart, houseEnd, appleTree, orangeTree, apples, oranges);

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int totalapples = 0;
        for (int i = 0; i < apples.size(); i++) {
            if(apples.get(i)>=s-a && apples.get(i)<=t-a)
                totalapples++;
        }
        System.out.println(totalapples);

        int totaloranges = 0;
        for (int i = 0; i < oranges.size(); i++) {
            if(oranges.get(i)<=t-b && oranges.get(i)>=s-b)
                totaloranges++;
        }
        System.out.println(totaloranges);
    }
}
