package com.naveen.dsa.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);

    }

    public static void plusMinus(List<Integer> arr) {
        int pos = 0;
        int neg = 0;
        int zer = 0;
        for(int e: arr){
            if(e>0)
                pos++;
            else if(e<0)
                neg++;
            else
                zer++;

        }
        Double posratio = (double)pos/arr.size();
        Double negratio = (double)neg/arr.size();
        Double zerratio = (double)zer/arr.size();

        System.out.println(String.format("%.6f",posratio));
        System.out.println(String.format("%.6f",negratio));
        System.out.println(String.format("%.6f",zerratio));

    }

}
