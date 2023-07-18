package com.naveen.dsa.leetcode.algorithms.sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author Naveen Kumar
 * @link https://leetcode.com/problems/sorting-the-sentence/
 *
 * @Description A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
 * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 */
public class SortingTheSentence {


    public static void main(String[] args) {
        String sentence1 = "is2 sentence4 This1 a3";
        String sentence2 = "sentence4 a3 is2 This1";

        System.out.println(sortTheSentence(sentence1));
        System.out.println(sortTheSentence(sentence2));
    }

    /**
     * this is my initial solution but this not the optimal solution, because it is already looping and also using streams again.
     *
     * @param sentence
     * @return
     */
    public static String sortTheSentence(String sentence){

        String[] words = sentence.split(" ");
        String[] orderedWords = new String[words.length];
        for (String word: words) {
            String serial = String.valueOf(word.charAt(word.length()-1));
            orderedWords[Integer.parseInt(serial)-1] = word.substring(0, (word.length()-1));
        }

        return String.join(" ", orderedWords);
    }




}
