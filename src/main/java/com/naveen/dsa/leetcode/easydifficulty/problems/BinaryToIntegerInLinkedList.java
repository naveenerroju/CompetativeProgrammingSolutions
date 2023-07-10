package com.naveen.dsa.leetcode.easydifficulty.problems;

public class BinaryToIntegerInLinkedList {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        String binaryString = "";
        while(head != null ){
            binaryString+=head.val;
            head=head.next;
        }
        return Integer.parseInt(binaryString,2);
    }

}
