package com.naveen.dsa.coursera.algorithmicwarmup;

public class GCD {

    public static void main(String[] args) {

    }

    //Using euclid's algorithm
    public static int gcd(int x, int y) {

        if (x == 0 || y == 0)   return Math.max(x, y);

       return gcd(y, x%y);
    }
}
