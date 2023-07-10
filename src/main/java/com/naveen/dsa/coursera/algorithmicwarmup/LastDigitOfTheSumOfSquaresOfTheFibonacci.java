package com.naveen.dsa.coursera.algorithmicwarmup;

public class LastDigitOfTheSumOfSquaresOfTheFibonacci {

    public static int lastDigitOfTheSumOfTheFibonacciAgain(int n, int m) {
        if (n<=1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = a+b;
        int sumAgain = 0;

        while (n >1){
            sum += a+b;
            int temp = a;
            a = b;
            b = temp+b;
            n--;
            sumAgain = sum*sum;
        }

        return sumAgain%10;
    }
}
