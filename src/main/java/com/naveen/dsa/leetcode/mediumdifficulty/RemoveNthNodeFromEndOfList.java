package com.naveen.dsa.leetcode.mediumdifficulty;

import com.naveen.utils.LinkedListUtility;
import com.naveen.utils.ListNode;

/**
 * @author <a href="">Naveen Kumar</a>
 * @link <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/">19. Remove Nth Node From End of List</a>
 * @description Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * First discovered this problem in the 'Data Structures and Algorithms Made Easy in Java' book.
 */
public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        int[] array = {1,2};
        ListNode result = bruteForceApproach(LinkedListUtility.convertArrayToList(array), 1);
        LinkedListUtility.printLinkedLists(result);
    }
    /**
     * First we will find out the size of the list, then we will know which node to remove from the start.
     * Complexity is O(n^2)
     * @param head
     * @param n
     * @return
     */
    public static ListNode bruteForceApproach(ListNode head, int n) {
        int size = 0;

        //finding the size of the
        ListNode currentForSize = head;
        while (currentForSize != null){
            size++;
            currentForSize=currentForSize.next;
        }

        //calculate the index in the list
        int index = size-n;
        System.out.println("size = "+size+" index = "+ index);

        //Removing the nth node from the end of the list
        ListNode currentForRemove = head;
        size = 1;
        while (currentForRemove != null){
            if(size==index-1){
                if(null==currentForRemove.next.next){
                    currentForRemove.next=currentForRemove.next.next;
                }
            }
            currentForRemove=currentForRemove.next;
            size++;
        }

        return head;
    }
}
