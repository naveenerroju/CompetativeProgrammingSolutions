package com.naveen.dsa.leetcode.easydifficulty.problems;


import com.naveen.utils.ListNode;

/**
 * @author Naveen Kumar<a href="mailto:naveenkumarerroju@gmail.com">
 * @description 83. Remove Duplicates from Sorted List. Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * This is optimised code which beats 61% of java users in memory. and 100% in runtime.
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {

        ListNode trimmed = head;
        ListNode temp = trimmed;

        if (trimmed == null) {
            return trimmed;
        }

        while (trimmed.next != null) {
            if (trimmed.val == trimmed.next.val) {
                trimmed.next = trimmed.next.next;
            } else {
                trimmed = trimmed.next;
            }
        }

        return temp;
    }

    /**
     * @param head
     * @return
     * @description this works but its a workaround I thought initially and submitted, it worked. But how to initialize lastUpdatedValue was confusing for me. After first submission, I came up with better solution
     * We can remove lastUpdatedValue variable and compare with node's value itself but the default value will be 0. so for the first iteration, if the head's value is also 0. then it will fail.
     * Note: In this method, we return the new ListNode. So we dont modify the parameter.
     */
    public ListNode deleteDuplicatesWithLastUpdatedFlag(ListNode head) {
        ListNode trimmed = new ListNode();
        ListNode temp = trimmed;
        int lastUpdatedValue = -2;

        while (head != null) {
            if (head.val != lastUpdatedValue) {
                lastUpdatedValue = head.val;
                trimmed.next = head;
                trimmed = trimmed.next;
            }
            head = head.next;
            trimmed.next = null;
        }

        return temp.next;
    }
}
