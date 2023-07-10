package com.naveen.dsa.coursera.algorithmicwarmup;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(fibonacciNumber(5));
    }

    //This works but it's too slow.
    public static int fibonacciNumberNaive(int n){

        if (n<=1) {
            return n;
        }

        return fibonacciNumberNaive(n - 1) + fibonacciNumberNaive(n - 2);
    }

    public static int fibonacciNumber(int n){

        if (n<=1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = a+b;

        while (n >1){
            sum = a+b;
            a = b;
            b = sum;
            n--;
        }

        return sum;
    }
}
