package com.naveen.DSA.hackerrank.warmup;
/*
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

candles = [4,4,1,2,4]    -> answer is 3, because there are 3units of candles with 4 heights.
*/

import java.util.List;
import java.util.Scanner;

public class BirthdayCandleCake {

    public static int birthdayCandleCake(List<Integer> list) {

        //linear scan for finding the tallest candle
        int tallest = list.get(0);  //storing value, not index
        for (int e : list)
            if (e > tallest)
                tallest = e;

        //linear scan for finding the units of tallestCandle
        int total = 0;
        for (int e : list)
            if (e == tallest)
                total++;

        return total;
    }


    public static void bestApproach() {
        /*
        this is a different approach I found in the discussions after submission.
        It has the best approach but this wont be applied to the current problem because the problem expected a function which takes list and return int.
        However the logic was most efficient.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of candles: ");
        int size = sc.nextInt();

        int tallest = 0;
        int total = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the heights of the candles: ");
            int number = sc.nextInt();
            if (number > tallest) {
                tallest = number;
            } else if (tallest == number) {
                total++;
            }
        }
        System.out.println(total);

    }

}
