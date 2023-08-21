package com.naveen.utils;

import java.util.List;

/**
 * This class contains basic functionality/util functions
 * As a good coding practice, it is important to implement only utility functions and make them final static
 *
 * @author Naveen Kumar
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
     * This method is used to print a LinkedList (com.naveen.utils)
     * @param node
     */
    public static final void printLinkedLists(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     * This method is used to get a String representation of a LinkedList (com.naveen.utils)
     * @param node
     * @return
     */
    public static final String linkedListToString(ListNode node) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        while (node != null) {
            sb.append(node.val + ",");
            node = node.next;
        }

        return sb.substring(0, sb.length() - 1) + "]";
    }
}
