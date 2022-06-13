package com.naveen;

import java.util.ArrayList;
import java.util.Random;

public class GenerateRandomArrayList {
    private int size;
    public ArrayList<Integer> list;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public GenerateRandomArrayList(int size) {
        this.size = size;
        this.list = generateRandomArrayList(1000, size);
    }

    public GenerateRandomArrayList(int scope, int size) {
        this.size = size;
        this.list = generateRandomArrayList(scope, size);
    }

    private ArrayList<Integer> generateRandomArrayList(int scope, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randomValue = random.nextInt(scope);
            if (arrayList.contains(randomValue)){
                int diff = size-randomValue;
                arrayList.add(randomValue+diff/3);
            } else {
                arrayList.add(randomValue);
            }
        }
        return arrayList;
    }
}
