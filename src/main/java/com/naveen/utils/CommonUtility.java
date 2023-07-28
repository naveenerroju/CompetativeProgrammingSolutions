package com.naveen.utils;

import java.util.List;

/**
 *This class contains basic functionality/util functions
 *
 * @author Naveen Kumar
 */
public class CommonUtility {

    /**
     * This method is used to get a String representation of a list
     * @param list
     * @return
     */
    public static final String arrayListToString(List<String> list) {
        StringBuffer buffer = new StringBuffer();
        for (String s : list) {
            buffer.append(s);
            buffer.append(", ");
        }
        buffer.substring(0, buffer.length() - 2);
        return buffer.toString();
    }
}
