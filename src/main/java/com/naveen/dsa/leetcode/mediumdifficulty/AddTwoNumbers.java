package com.naveen.dsa.leetcode.mediumdifficulty;

import com.naveen.utils.ListNode;

/**
 * @author <a href="">naveen kumar</a>
 * @description 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    /**
     * Runtime: Beats 100.00%of users with Java. Memory: Beats 61.75%of users with Java.
     * This is a simpler solution from a YouTube video.
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode listNode = new ListNode();
        ListNode head  = listNode;
        int carry = 0;
        while(null!=l1|| null!=l2 || carry!=0){
            int sum = 0;
            if(null!=l1){
                sum+=l1.val;
                l1=l1.next;
            }

            if (null!=l2) {
                sum+=l2.val;
                l2=l2.next;
            }

            sum+=carry;
            carry = sum/10;

            ListNode temp = new ListNode();
            temp.val=sum%10;
            listNode.next=temp;
            listNode = listNode.next;
        }

        return head.next;
    }

    /**
     * This method works only with integers. Mind Integer overflow.
     * @param list
     * @return
     */
    private static int reverseLinkedListToInteger(ListNode list){
        int number = 0;
        int iterator = 10;
        while(list!=null){
            number+=list.val*iterator;
            iterator*=10;
            list=list.next;
        }

        return number/10;
    }

    /**
     * This is not a solution. Because this solution doesn't work when there is a carry in the calculation.
     * But the question asked to carry when the sum has two digits.
     *
     * @param l1 ListNode 1
     * @param l2 ListNode 2
     * @return ListNode of the sum
     */
    public static ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        int sum1 = reverseLinkedListToInteger(l1);
        int sum2 = reverseLinkedListToInteger(l2);

        int sum = sum1+sum2;
        System.out.println("actual sum1: "+sum1);
        System.out.println("actual sum2: "+sum2);
        System.out.println("actual sum: "+sum);
        if(sum == 0){
            return new ListNode(0);
        }

        return integerToList(sum);

    }
    /**
     * This method will reverse the digits provided in the list.
     * If LinkedList is 4->3->2->1 then the return will be the integer of 1234.
     * Keep in mind that this will work only if the given list has single digit elements.
     * @param l1 single list of single digit elements
     * @return integer of reversely concatenated list
     */
    private static int reverseLinkedListToIntegerSum(ListNode l1){
        int sum = 0;
        int iterator = 10;
        while(l1!=null){
            l1.val*=iterator;
            iterator*=10;
            sum+=l1.val;
            l1 = l1.next;
        }
        return sum/10;
    }
    private static ListNode integerToList(int sum){
        ListNode head = new ListNode();
        ListNode result = head;

        while(sum>0){
            ListNode temp = new ListNode(sum%10);
            result.next=temp;
            result = result.next;
            sum/=10;
        }

        return head.next;
    }

    /**
     * This is developed based on a wrong interpretation of question. if the array hs 2,4,5 values, I'm doing addition for 245 which is the sequal order of the given numbers.
     * But the question is to reverse the values and make them 542 and add them to sum.
     * This solution will work but this doesn't pass leetcode tests.
     * @param l1 ListNode 1
     * @param l2 ListNode 2
     * @return ListNode of the sum
     */
    public static ListNode addTwoNumbersReverseTheResult(ListNode l1, ListNode l2) {
        StringBuilder sum1 = new StringBuilder();
        StringBuilder sum2 = new StringBuilder();

        while (l1 != null || l2 != null) {
            if(l1!=null){
                sum1.append(l1.val);
                l1 = l1.next;
            }
            if(l2!=null) {
                sum2.append(l2.val);
                l2 = l2.next;
            }
        }

        int sum = Integer.parseInt(sum1.toString()) + Integer.parseInt(sum2.toString());

        if(sum == 0){
            return new ListNode(0);
        }

        System.out.println(sum);
        ListNode head = new ListNode();
        ListNode result = head;

        while(sum>0){
            ListNode temp = new ListNode(sum%10);
            result.next=temp;
            result = result.next;
            sum/=10;
        }

        return head.next;
    }

}
