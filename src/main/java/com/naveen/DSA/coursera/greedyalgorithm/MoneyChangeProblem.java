package com.naveen.DSA.coursera.greedyalgorithm;

import java.util.Arrays;

public class MoneyChangeProblem {
    static int[] denominations = {50,10,5,1};


    public static void main(String[] args) {
        System.out.println(moneyChange(916));
    }

    public static int moneyChange(int amount){
        int numberOfCoins = 0;
        while(amount>0){
            for(int e: denominations){
                if(e<=amount){
                    numberOfCoins++;
                    amount-=e;
                    break;
                }
            }
        }
        return numberOfCoins;
    }
}
