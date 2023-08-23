package com.naveen.utils;

import java.util.List;

/**
 * This class contains basic functionality/util functions
 * As a good coding practice, it is important to implement only utility functions and make them final static
 *
 * @author <a href="mailto:naveenkumarerroju@gmail.com">Naveen Kumarer</a>
 */
public class CommonUtility {

    /**
     * This method is used to get a String representation of a list
     *
     * @param list
     * @return
     */
    public static final String arrayListToString(List<String> list) {
        StringBuffer buffer = new StringBuffer();
        for (String s : list) {
            buffer.append(s);
            buffer.append(",");
        }
        return buffer.substring(0, buffer.length() - 1);
    }

    /**
     * This method is used to get a String representation of a list of integers
     *
     * @param list
     * @return
     */
    public static final String arrayListOfIntToString(List<Integer> list) {
        StringBuffer buffer = new StringBuffer();
        for (int s : list) {
            buffer.append(s);
            buffer.append(",");
        }
        return buffer.substring(0, buffer.length() - 1);
    }

    /**
     * This method provides the GCD of two given integers
     *
     * @param num1
     * @param num2
     * @return
     */
    public static int findGreatestCommonDivisors(int num1, int num2) {

        int min = Integer.min(num1, num2);
        while (num1 % min != 0 || num2 % min != 0) {
            min--;
        }

        return min;
    }

}
