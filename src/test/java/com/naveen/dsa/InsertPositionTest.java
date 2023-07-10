package com.naveen.dsa;

import com.naveen.dsa.leetcode.easydifficulty.binarysearch.InsertPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertPositionTest {

    int[] array = {1,3,5,6};

    @Test
    void testCase1(){
        InsertPosition insertPosition = new InsertPosition();
        int actual = insertPosition.searchInsert(array, 5);
        assertEquals(2, actual);
    }

    @Test
    void testCase2(){
        InsertPosition insertPosition = new InsertPosition();
        int actual = insertPosition.searchInsert(array, 2);
        assertEquals(1, actual);
    }

    @Test
    void testCase3(){
        InsertPosition insertPosition = new InsertPosition();
        int actual = insertPosition.searchInsert(array, 7);
        assertEquals(4, actual);
    }

}