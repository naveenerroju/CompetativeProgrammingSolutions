package com.naveen.dsa.coursera;

//Coursera practice of week 2

import java.math.BigInteger;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        //Test here
        BigInteger numb1 = new BigInteger("25789234");
        BigInteger numb2 = new BigInteger("314789");
        System.out.println(numb1.gcd(numb2));

        System.out.println(gcp(25789234,314789));
    }


    public static int gcp(int a, int b){
        a=b;
        b=b%a;

        if(a==0){
            return b;
        } else if(b==0){
            return a;
        }

        return gcp(a,b);
    }


    public static int bruteForce(int one, int two){


        int shortest = Math.min(one, two);
        int gcp = 0;
        for (int i = 1; i <= shortest; i++) {
            if(one%i==0 && two%i==0){
                gcp = i;
            }
        }

        return gcp;
    }

}
