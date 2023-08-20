package com.naveen.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CommonUtilityTest {

    @Test
    void arrayListToString() {
        List<String> list = new ArrayList<String>();
        list.add(new String("hello  world"));
        list.add(new String("hello  world"));
        list.add(new String("hello  world"));
        String result = CommonUtility.arrayListToString(list);

        String expected = "hello  world,hello  world,hello  world";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void arrayListOfIntToString() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String result = CommonUtility.arrayListOfIntToString(list);

        String expected = "1,2,3";
        Assertions.assertEquals(expected, result);
    }
}