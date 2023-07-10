package com.naveen.dsa.coursera.algorithmicwarmup;

public class LastDigitOfTheSumOfTheFibonacci {

    public static int lastDigitOfTheSumOfTheFibonacci(int n){

        if (n<=1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int sum = a+b;

        while (n >1){
            sum += a+b;
            int temp = a;
            a = b;
            b = temp+b;
            n--;
        }

        return sum%10;
    }
}
