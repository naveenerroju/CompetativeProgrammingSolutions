package com.naveen.dsa.leetcode.algorithms.twopointers;


public class RemoveNthNodeFromEndOfTheList {
//Leetcode problem 19
    //I couldnt solve the problem properly. so i used solution in youtube.

    //two pointer approach. Fast and Slow approaches.
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //a typical way of solving linked lists by using a dummy head.
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        //if given number is 3, when slow index is at 0, fast index will be at 3.
        //So when slow index reaches the given number we know because the fast end will reach the end.
        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }

        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next = slow.next.next;
        return dummyHead.next;

    }

}

