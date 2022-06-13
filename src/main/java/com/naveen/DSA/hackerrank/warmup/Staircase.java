package com.naveen.DSA.hackerrank.warmup;

/*

   #
  ##
 ###
####

its a staircase of given number of steps (n=4 in the above example).
*/

public class Staircase {

    public static void main(String[] args) {
        staircase(4);
    }

    public static void staircase(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=n-i){
                    System.out.print(" ");
                } else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }

}
