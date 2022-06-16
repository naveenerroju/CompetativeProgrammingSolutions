package com.naveen.DSA.leetcode.algorithms;
/*
The class ListNode wont work properly, It's only for reductio of error.
This entire code wont work in our System because of the depending clases.
*/

import java.util.ArrayList;

public class MiddleoftheLinkedList {


    //My solution works 100% faster than other submissions. Yet, only 5% smaller than others in size.
    //Because I submitted with Arraylist and i also made a duplicate listnode unnecessarily.
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        ArrayList<ListNode> nodes = new ArrayList<ListNode>();
        nodes.add(node.next);
        while(node.next!=null){
            nodes.add(node.next);
            node = node.next;
        }
        ListNode middle = nodes.get(nodes.size()/2);
        return head.next==null? head : middle;
    }

    //Leetcodes solution. much compatible than mine. By repalcing array with arraylist and
    public ListNode leetCodeSolution(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
}

