package com.naveen.utils;

import java.util.Random;

/**
 * @author <a href="mailto:naveenkumarerroju@gmailcom.com">Naveen Kumarer</a>
 * @
 */
public class ArraysUtility {

    /**
     *@description Using binary search this method will return the position of the target integer in given array. If not found it will return -1.
     * @param array
     * @param target
     * @return
     */
    public static int binarySearchInArray(int[] array, int target){

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }

    /**
     * This method will generate an array of given size with random integers in it.
     *
     * @param size
     * @return
     */
    public static int[] generate(int size){
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

    public static int[] getArray(){
        return new int[]{1,4,2,6,8,323,68,231234,764,123253};
    }


}
