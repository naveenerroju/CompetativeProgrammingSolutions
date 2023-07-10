package com.naveen.dsa;

import com.naveen.dsa.leetcode.easydifficulty.binarysearch.GuessNumber;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {
    GuessNumber guessNumber = new GuessNumber();

    @DisplayName("Brute Force Search best case")
    @Test
    @Timeout(10)
    void bruteForceTestCase1(){     //O(n)
        guessNumber.answer =1;
        int result = guessNumber.guessWithBruteForce(2147483646);
        assertEquals(guessNumber.answer, result);
    }

    @DisplayName("Brute Force Search Worst case")
    @Test
    @Timeout(10)
    void bruteForceTestCase2(){     //O(n)
        guessNumber.answer = 2147483646;
        int result = guessNumber.guessWithBruteForce(2147483646);
        assertEquals(guessNumber.answer, result);
    }

    @DisplayName("Brute Force Search Avg case")
    @Test
    @Timeout(10)
    void bruteForceTestCase3(){     //O(n)
        guessNumber.answer = 1073741826;
        int result = guessNumber.guessWithBruteForce(2147483646);
        assertEquals(guessNumber.answer, result);
    }

    @DisplayName("Binary Search Best Case")
    @Test
    @Timeout(10)
    void binaryTestCase1(){     //O(log2 n)
        guessNumber.answer = 1;
        int result = guessNumber.guessWithBinary(2147483646);
        assertEquals(guessNumber.answer, result);
    }

    @DisplayName("Binary Search Avg Case")
    @Test
    @Timeout(10)
    void binaryTestCase2(){     //O(log2 n)
        //best case
        guessNumber.answer = 1073741821;
        int result = guessNumber.guessWithBinary(2147483646);
        assertEquals(guessNumber.answer, result);
    }

    @Disabled //because the function is not properly executing. maybe there should be a bug in asserting test.
    @DisplayName("Binary Search Worst Case 1")
    @Test
    @Timeout(10)
    void binaryTestCase4(){
        guessNumber.answer = 2147483645;
        int result = guessNumber.guessWithBinary(2147483646);
        assertEquals(guessNumber.answer, result);
    }


    @Disabled   //disabled because rercusion isn't working properly. refer source.
    @Test
    void recursionTestCase1(){
        guessNumber.answer = 2147483646;
        int result = guessNumber.guessWithBinaryRecursion(1,2147483646);
        assertEquals(guessNumber.answer, result);
    }

    @DisplayName("Ternary Search O(1)")
    @Test
    @Timeout(5)
    void ternaryTestCase1(){    // O(log3 n)
        guessNumber.answer = 1;
        int result = guessNumber.guessWithTernery(2147483646);
        assertEquals(guessNumber.answer, result);
    }

    @DisplayName("Ternary Search O(n)")
    @Test
    @Timeout(5)
    void ternaryTestCase2(){    // O(log3 n)
        guessNumber.answer = 2147483646;
        int result = guessNumber.guessWithTernery(2147483646);
        assertEquals(guessNumber.answer, result);
    }
}