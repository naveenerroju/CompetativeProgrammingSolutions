package com.naveen.dsa.leetcode.easydifficulty.linkedlist;

import com.naveen.utils.ListNode;

/**
 * @description 141. Linked List Cycle
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * @author <a href="mailto:naveenkumarerroju@gmail.com"> Naveen Kumar</a>
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        while(head!=null){
            ListNode temp = head.next;
            while(temp!=null){
                if(head==temp.next){
                    return true;
                } else {
                    temp = temp.next;
                }
            }
            head = head.next;
        }
        return false;
    }
}
