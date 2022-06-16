package com.naveen.DSA.recursionandbacktracking;

public class DecimalToBinary {

    public static String convertToBinary(int decimal, String binary){

        if(decimal>=1){
            binary=decimal%2+binary;
            decimal=decimal/2;
            return convertToBinary(decimal, binary);
        }

        return binary;
    }

}
