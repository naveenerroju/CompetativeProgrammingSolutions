package com.naveen.DSA.coursera;

//COURSERA ASSIGNMENT

import com.naveen.GenerateRandomArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxPairwise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<Integer>();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(improvisedAlgorithm(list));
    }

    //double loops (not nested) (worst case 2n)
    public static long improvisedAlgorithm(ArrayList<Integer> list){

        int max1 = 0;
        int max1Index = 0;
        //we want to store the index because we have to avoid max1 index for max2, not max1 value, in order to make it consider duplicate values
        for (int i=0;i<list.size();i++){
            if(list.get(i)>max1){
                max1=list.get(i);
                max1Index = i;
            }
        }

        int max2 = 0;
        for (int i=0;i<list.size();i++){
            if(list.get(i)>max2 && i!=max1Index){
            //if(list.get(i)>max2 && list.get(i)!=max1){
                max2=list.get(i);
            }
        }

        //System.out.println("actual result "+max1+"*"+max2+"="+(long)max1*(long)max2);
        return (long)max1*(long)max2;

    }

    public static void stressTest(){

        //boolean testing = true;

        int numberOfTests = 200;
        int currentTest = 1;

        while (currentTest <= numberOfTests){

            GenerateRandomArrayList randomArrayList = new GenerateRandomArrayList(20, 10);
            ArrayList<Integer> list = randomArrayList.list;

            long expected = basicAlgorithm(list);
            long actual = improvisedAlgorithm(list);

            if(actual==expected){
                currentTest++;
                System.out.println("Test case "+currentTest+" passed!");
                System.out.println(list);
            } else {
                System.out.println("Test case "+currentTest+" failed!");
                System.out.println("Given List: "+list);
                System.out.println("Actual result = "+actual);
                System.out.println("Expected result = "+expected);
                break;
            }
        }
    }

    //brute force implementation (worst case n*n)
    public static long basicAlgorithm(ArrayList<Integer> list){
        long max = 0;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                long temp = (long)list.get(j) * (long)list.get(i);
                if (temp > max) {
                    max = temp;
                }
            }
        }
        //System.out.println("Expected result is "+max);
        return max;
    }

    //my first solution. *failed*
    /*

    public static int maxPairWise(int n){
        int total=1;
        for(int i=1; i<=n; i++){
            int value = sc.nextInt();
            if(value>0&&value<Math.pow(10, 5)) {
                list.add(value);
            }
        }
        int[] array = detectMax(list);
        for (int i=0;i<array.length;i++){
            total=total*array[i];
        }
        return total;
    }

    public static int[] detectMax(ArrayList<Integer> list){
        int[] array  = new int[2];
        int max=list.get(0);
        for (int i = 0; i < array.length; i++) {
            for(int e: list ){
                if (e>max){
                    max = e;
                }
            }
            array[i]=max;
            list.remove((Integer) max);     //but max value isn't changing
        }
        return array;
    }

    */
}
