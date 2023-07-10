package com.naveen.dsa.coursera.algorithmicwarmup;

public class LastDigitOfTheSumOfTheFibonacciAgain {

    public static void main(String[] args) {
        System.out.println(lastDigitOfTheSumOfTheFibonacciAgain(10, 8));
    }

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
            if(n>=m){
                sumAgain+=sum;
            }
        }

        return sum%10;
    }
}
