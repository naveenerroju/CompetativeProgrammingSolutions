package com.naveen.utils;

import java.util.List;

/**
 *This class contains basic functionality/util functions
 * As a good coding practice, it is important to implement only utility functions and make them final static
 *
 * @author Naveen Kumar
 */
public class CommonUtility {

    /**
     * This method is used to get a String representation of a list
     * @param list
     * @return
     */
    public final String arrayListToString(List<String> list) {
        StringBuffer buffer = new StringBuffer();
        for (String s : list) {
            buffer.append(s);
            buffer.append(",");
        }
        return buffer.substring(0, buffer.length() - 1);
    }

    /**
     * This method is used to get a String representation of a list of integers
     * @param list
     * @return
     */
    public final String arrayListOfIntToString(List<Integer> list) {
        StringBuffer buffer = new StringBuffer();
        for (int s : list) {
            buffer.append(s);
            buffer.append(",");
        }
        return buffer.substring(0, buffer.length() - 1);
    }
}
