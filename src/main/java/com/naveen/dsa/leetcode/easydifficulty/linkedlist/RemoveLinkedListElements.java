package com.naveen.dsa.leetcode.easydifficulty.linkedlist;

import com.naveen.utils.ListNode;

/**
 * @author <a href="">Naveen Kumar</a>
 * @link <a href="https://leetcode.com/problems/add-two-numbers/description/?envType=list&envId=erdkoq9t">203. Remove Linked List Elements</a>
 * @description Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */
public class RemoveLinkedListElements {

    /**
     * RunTime: Beats 92.30%of users with Java. Memory: Beats 10.18%of users with Java.
     * Memory is bad because of a lot of list nodes are being created. Perhaps this is a brute force approach.
     * @param head
     * @param val
     * @return
     */
    public static ListNode removeElements(ListNode head, int val) {
        ListNode current = new ListNode();
        ListNode dummy = current;

        while (head != null) {

            if (head.val != val) {
                current.next = new ListNode(head.val);
                current = current.next;
            }

            head = head.next;
        }

        return dummy;
    }
}
