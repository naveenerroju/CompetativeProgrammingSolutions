package com.naveen.DSA;

import com.naveen.DSA.leetcode.easydifficulty.binarysearch.MountainArray;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MountainArrayTest extends MountainArray {


    int[] array1 = {0, 1, 0};
    int[] array2 = {0, 2, 1, 0};
    int[] array3 = {0, 10, 5, 1,0};
    int[] array4 = {5, 11, 51, 111,2341,11002,234678};

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    void testCase1(){
        int actualResult = assertTimeout(Duration.ofSeconds(3), ()-> peakIndexMountainArrayBinary(array1));
        int expectedResult = solution(array1);
        assertEquals(expectedResult, actualResult);
    }

    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    @Test
    void testCase2(){
        int actualResult = assertTimeout(Duration.ofSeconds(3), ()-> peakIndexMountainArrayBinary(array2));
        int expectedResult = solution(array2);
        assertEquals(expectedResult, actualResult);
    }

    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    @Test
    void testCase3(){
        int actualResult = assertTimeout(Duration.ofSeconds(3), ()-> peakIndexMountainArrayBinary(array3));
        int expectedResult = solution(array3);
        assertEquals(expectedResult, actualResult);
    }

    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    @Test
    void testCase4(){
        int actualResult =assertTimeout(Duration.ofSeconds(3), ()-> peakIndexMountainArrayBinary(array4));
        int expectedResult = solution(array4);
        assertEquals(expectedResult, actualResult);
    }

}