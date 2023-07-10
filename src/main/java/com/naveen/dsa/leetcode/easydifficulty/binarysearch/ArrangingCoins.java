package com.naveen.dsa.leetcode.easydifficulty.binarysearch;
/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins.
The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.


EXAMPLE:
given number is 17

lets build a stair case:
1
2  3
4  5  6
7  8  9  10
11 12 13 14 15
16 17

now the complete step is 5th, so the result is 5. result is not 6 because 6th step is not complete.
*/

public class ArrangingCoins {

    public static void main(String[] args) {
        System.out.println(optimizedSolution(38));   //expected 8
        //System.out.println(slowSolution(2147483647));   //worst case - check time of execution
    }

    public static int optimizedSolution(int n){

        int i = 1;

        while(n>=i){
            n-=i;
            i++;
        }

        return --i;
    }

    public static int bruteForce(int n){    //takes forever to run big integers

        int completedStep = 1;
        int steps=1;
        int low = 1;
        int high =1;

        while (high<=n){
            low = high+1;
            high = low+steps;
            steps++;
            if(high<=n){
                completedStep++;
            }
        }

        return completedStep;
    }

}
/*
Display

1                                   1
2   3                               2
4   5   6                           3
7   8   9   10                      4
11  12  13  14  15                  5
16  17  18  19  20  21              6
22  23  24  25  26  27  29          7
30  31  32  33  34  35  36  37      8
38  39  40


Optimized: (mathematical logic)
Sum of the series = n(n-1)/2
if n = 10 => 10(9)/2 = 45
so that means 1-9 elements sum is 45.
*/
