package com.naveen.dsa.leetcode.easydifficulty.linkedlist;

import com.naveen.utils.ListNode;

public class ReverseLinkedList {

    /**
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

}
