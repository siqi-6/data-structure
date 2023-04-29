package com.recursion;

import org.w3c.dom.Node;

public class getNodeValue<E> {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode listNode = new ListNode(nums);
        ListNode node = new getNodeValue<Integer>().deleteValue(listNode, 1);
        System.out.println(node);
    }

    public ListNode deleteValue(ListNode head, int value) {
        if (head == null) {
            System.out.println("return null");
            return null;
        }
        System.out.println("before"+ head);
        head.next = (ListNode) deleteValue(head.next, value);
        System.out.println("return "+ head);
        return head.val==value? head.next : head;
    }
}

