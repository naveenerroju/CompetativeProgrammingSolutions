package com.naveen.dsa.leetcode.easydifficulty.linkedlist;

import com.naveen.utils.ListNode;

import java.util.HashSet;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com"> Naveen Kumar</a>
 * @description 141. Linked List Cycle
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {

    /**
     * We are using a DS to track the completed nodes. HashSet is the best.
     * It's an easy BruteForce algorithm. But this consumes lot of memory.
     *
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet();
        while (head != null) {
            if (!hashSet.contains(head)) {
                hashSet.add(head);
            } else {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    /**
     * This algorithm doesn't work, because there is no null in the cycle linked list.
     *
     * @param head
     * @return
     */
    public boolean failureTwoPointer(ListNode head) {

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
