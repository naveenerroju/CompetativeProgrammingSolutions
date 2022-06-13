package com.naveen.DSA.coursera;

//Coursera practice of week 2

public class FibonacciNumber {

    public static long efficientAlgo(long n){

        if (n<=1){
            return n;
        }

        long a = 0;
        long b = 1;
        long sum = a+b;

        while (n>1){
            sum=a+b;
            a=b;
            b=sum;
            n--;
        }

        return sum;
    }

    public static long nativeAlgo(long n){
        if (n<=1){
            return n;
        } else {
            return (long)nativeAlgo(n-1)+(long)nativeAlgo(n-2);
        }
    }

    public static void main(String[] args) {

        stressTest(30);

    }

    public static void stressTest(int testcases){

        testcases++;
        int fibOf = 0;
        long timer = System.currentTimeMillis();

        while (testcases>=1){
            long nativeResult = nativeAlgo(fibOf);
            if (nativeResult==efficientAlgo(fibOf)){
                System.out.println("testcase passed with the F("+fibOf+"): "+nativeResult+" in "+(System.currentTimeMillis()-timer)+" ms");
            }

            fibOf++;
            testcases--;
        }

    }



}
