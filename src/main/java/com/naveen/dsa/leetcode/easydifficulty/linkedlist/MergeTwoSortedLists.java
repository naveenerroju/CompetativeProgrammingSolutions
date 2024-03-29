package com.naveen.dsa.leetcode.easydifficulty.linkedlist;

import com.naveen.utils.ListNode;

/**
 * @author Naveen Kumar <a href="mailto:naveenkumarerroju@gmail.com">
 * @description Merge Two Sorted Lists
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;


        ListNode head = new ListNode();
        ListNode temp = head;
        head.next = temp;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else if (list2 != null) {
            temp.next = list2;
        }

        return head.next;
    }

}
