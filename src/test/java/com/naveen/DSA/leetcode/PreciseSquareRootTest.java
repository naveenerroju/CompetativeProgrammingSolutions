package com.naveen.DSA.leetcode;

import com.naveen.DSA.leetcode.easydifficulty.binarysearch.PreciseSquareRoot;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreciseSquareRootTest extends PreciseSquareRoot {

    @Test
    void testCase1(){
        assertEquals(4, sqrt(16));
    }
    @Test
    void testCase2(){
        assertEquals(2, sqrt(8));
    }

    @Test
    void testCase3(){
        assertEquals(4, sqrt(16));
    }

    @Test
    void testCase4(){
        assertEquals(4, sqrt(16));
    }

    @Test
    void testCase5(){
        assertEquals(4, sqrt(17));
    }

    @Test
    void testCase6(){
        assertEquals(5, sqrt(26));
    }

    @Test
    void testCase7(){
        assertEquals(2, sqrt(4));
    }

    @Test
    void testCase8(){
        assertEquals(122, sqrt(14987));
    }

    @Test
    void testCase9(){
        int actual =  sqrt(7982423);
        assertEquals(2825, actual);
    }

    @Test
    void testCase10(){
        assertEquals(1, sqrt(1));
    }

    @Test
    @DisplayName("Stress Test")
    @AfterAll
    static void stresTest(){

        //Constraints = 0 <= x <= 2^31 - 1

        int numb = 10;
        int testcases = 10000;
        //int testcases = (int)Math.pow(2,31)-1;

        while (numb<=testcases){

            int expected = (int)Math.sqrt(numb);
            int actual = sqrt(numb);
            if(expected!=actual){
                fail("Testcase failed for given number "+numb);
                break;
            }
            System.out.println("Testcase passed for given number "+numb);

            numb++;
        }
        System.out.println("All test cases of stress test passed.");
    }

}