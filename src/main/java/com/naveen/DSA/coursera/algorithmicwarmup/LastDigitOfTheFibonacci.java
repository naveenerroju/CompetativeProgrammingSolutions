package com.naveen.DSA.coursera.algorithmicwarmup;

public class LastDigitOfTheFibonacci {

    public static void main(String[] args) {
        //sample case
        System.out.println(fibonacciNumber(10));
    }

    public static int fibonacciNumber(int n){

        if (n<=1) {
            return n;
        }

        long a = 0;
        long b = 1;
        long sum = a+b;

        while (n >1){
            sum = a+b;
            a = b;
            b = sum;
            n--;
        }

        return (int)sum%10;	//very negligible chance of conversion exception
    }
}
