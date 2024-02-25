package com.naveen.dsa.leetcode.mediumdifficulty;

public class RemoveDuplicatesfromSortedArrayII {


    public static int removeDuplicates(int[] arr) {
        int currentWritingIndex = 0;

        //edge cases
        if(arr.length<2){
            return arr.length;
        }
        int i = 0;

        // loop through the elements
        while(i<arr.length) {
            int left = i, right = i + 1, count = 1;

            // loop untill the differet element is found
            while (right < arr.length && arr[left] == arr[right]) {
                count++;
                left++;
                right++;
            }
            int tempIndex = i+count;
            // write the elements
            arr[currentWritingIndex] = arr[i];
            count--;
            currentWritingIndex++;
            if (count > 0){
                arr[currentWritingIndex] = arr[i];
                currentWritingIndex++;
            }
            i=tempIndex;

        }

        return currentWritingIndex;
    }
}
