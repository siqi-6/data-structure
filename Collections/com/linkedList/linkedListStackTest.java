package com.linkedList;

public class linkedListStackTest {
    public static void main(String[] args) {
        linkedListStack<Integer> stack = new linkedListStack<Integer>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }

}
