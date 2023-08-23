package com.naveen.utils;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">Naveen Kumarer</a>
 */
public class LinkedListUtility {


    /**
     * This method is used to print a LinkedList (com.naveen.utils)
     *
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
     *
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
