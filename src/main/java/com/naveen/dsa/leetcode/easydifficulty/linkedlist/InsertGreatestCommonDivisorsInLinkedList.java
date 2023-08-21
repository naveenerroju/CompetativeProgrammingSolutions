package com.naveen.dsa.leetcode.easydifficulty.linkedlist;

import com.naveen.utils.CommonUtility;
import com.naveen.utils.ListNode;


/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com"> Naveen Kumar</a>
 * @description 2807. Insert Greatest Common Divisors in Linked List
 * Given the head of a linked list head, in which each node contains an integer value.
 * Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.
 * Return the linked list after insertion.
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * @link https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
 */
public class InsertGreatestCommonDivisorsInLinkedList {

    /**
     * This might not be the most efficient implementation but still it works.
     *
     * @param head
     * @return
     */
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        if (head.next == null) {
            return head;
        }

        while (head.next != null) {
            int gcd = CommonUtility.findGreatestCommonDivisors(head.val, head.next.val);
            ListNode newNode = new ListNode(gcd);
            newNode.next = head.next;
            head.next = newNode;
            head = head.next.next;
        }

        return temp;
    }


}
