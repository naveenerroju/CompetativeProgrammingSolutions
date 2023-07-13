package com.naveen.dsa.leetcode.algorithms;

/**
 * Given the array of strings with various lengths, sort them in the ascending order from shortest string
 * to the longest string
 * Ex: {"a","cccccc","bbbb","xx"} => {"a","xx","bbbb","cccccc"}
 *
 * @return
 */
public class JavaPractice1
{
    public static void main(String[] args) {
        String[] arr = {"a", "cccccc", "bbbb", "xx"};
        String[] newArr = sortedArrayString(arr);
        for(String str : newArr) {
            System.out.println(str);
        }
    }
    public static String[] sortedArrayString(String[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 1; j < (n-i); j++)
            {
                if (arr[j-1].length() > arr[j].length())
                {
                    String temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

}