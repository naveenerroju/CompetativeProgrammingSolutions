package com.naveen.DSA.coursera.algorithmicwarmup;//Currently, in development. Couldn't understand the whole thing.

public class FibonacciNumberAgain {

    public static void main(String[] args) {
        //sample input-output here
    }

    //Using an interesting logic called "Pisano Period".
    //This is based on the cycle of fibonacciNumber
    public static long fibonacciNumber(long n, int mod) {

        if (n<=1) return n;

        long a = 0;
        long b = 1;
        long sum = a+b;

        while (n >1){
            sum = (long)a+b;
            a = b;
            b = sum;
            n--;
        }
        return Math.abs(sum%mod);
    }
}
