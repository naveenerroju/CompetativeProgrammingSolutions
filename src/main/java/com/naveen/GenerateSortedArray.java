package com.naveen;

import java.util.Random;

//not working so far. currently working

public class GenerateSortedArray {

    private int size;
    private int[] array = new int[size];

    public GenerateSortedArray(int size){
        this.size = size;
    }

    private int[] generate(int size){
        int[] array = new int[size];
        Random random = new Random();

        for(int i=0;i<size;i++){
            boolean added = false;
            while(!added){
                int rand = random.nextInt();
                if(rand>=array[i-1]){
                    array[i]=rand;
                    added=true;
                }
            }
        }

        return array;

    }

    public int[] getArray() {
        return array;
    }
}
