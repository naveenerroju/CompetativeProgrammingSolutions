package com.naveen.DSA;

import com.naveen.DSA.leetcode.easydifficulty.binarysearch.SmallestLetterGreaterThanTarget;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestLetterGreaterThanTargetTest extends SmallestLetterGreaterThanTarget {


    @Test
    void testCase1(){
        char[] letters = {'c','f','j'};
        char target = 'a';

        assertEquals('c',solution(letters, target));
    }

    @Test
    void testCase2(){
        char[] letters = {'c','f','j'};
        char target = 'c';

        assertEquals('f',solution(letters, target));
    }
    @Test
    void testCase3(){
        char[] letters = {'c','f','j'};
        char target = 'd';

        assertEquals('f',solution(letters, target));
    }



}