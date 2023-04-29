package com.linkedList;

public class linkedlistQueueTest {
    public static void main(String[] args) {
        LinkedlistQueue<Integer> queque = new LinkedlistQueue<>();
        for (int i = 0; i < 5; i++) {
            queque.enqueue(i);
        }
        System.out.println(queque);
        queque.dequeue();
        System.out.println(queque);
        System.out.println(queque.peek());
        queque.enqueue(11);
        System.out.println(queque);
    }
}
