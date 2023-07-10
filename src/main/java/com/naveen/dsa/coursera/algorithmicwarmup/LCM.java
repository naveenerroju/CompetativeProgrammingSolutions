package com.naveen.dsa.coursera.algorithmicwarmup;

public class LCM {

    public static void main(String[] args) {
        //sample case
        System.out.println(lcm(10,25)); //expected 50
    }

    //Using a mathematical expression of :- a*b = GCD*LCM
    //That can be written as (a*b)/GCD = LCM
    public static int lcm(int x, int y){
        return (x*y)/(findgcd(x, y));
    }

    //Using the previously used GCD logic.
    public static int findgcd(int x, int y) {

        if (x == 0 || y == 0)   return Math.max(x, y);

        return findgcd(y, x%y);
    }
}
