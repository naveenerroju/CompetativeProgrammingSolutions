package com.naveen.dsa.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        ArrayList<Integer> scores = new ArrayList<>();
        int alice = 0;
        int bob = 0;
        for(int i=0; i<a.size();i++){
            if(a.get(i)>b.get(i)){
                alice++;
            } else if(a.get(i)<b.get(i)) {
                bob++;
            }
        }
        scores.add(alice);
        scores.add(bob);

        return scores;
    }
}
