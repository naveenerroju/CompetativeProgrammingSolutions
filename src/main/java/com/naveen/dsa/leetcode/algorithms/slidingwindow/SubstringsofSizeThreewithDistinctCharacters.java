package com.naveen.dsa.leetcode.algorithms.slidingwindow;

/**
 * @author Naveen Kumar
 *
 * @description A string is good if there are no repeated characters.
 * Given a string s, return the number of good substrings of length three in s.
 * Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
 * A substring is a contiguous sequence of characters in a string.
 */
public class SubstringsofSizeThreewithDistinctCharacters {

    public static void main(String[] args) {
        System.out.println(optimisedSolution("xyzzaz"));
    }

    /**
     * Same solution but optimised by removing local variables. This will cause readability issues
     * But this solution beats 92% solutions in speed
     * @param s
     * @return
     */
    public static int optimisedSolution(String s){
        int count = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i+2)!=s.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length()-2;i++){
            String sub = s.substring(i, i+3);
            System.out.println(sub);
            if(!isUniqueString(sub)){
                count++;
            }
        }
        return count;
    }
    private static boolean isUniqueString(String str){
        Character c1 = str.charAt(0);
        Character c2 = str.charAt(1);
        Character c3 = str.charAt(2);

        if(c1.equals(c2) || c1.equals(c3) || c2.equals(c3)){
            return true;
        }

        return false;
    }

}
