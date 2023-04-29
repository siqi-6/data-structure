package com.array;

public class QueueTest {

    public static void main(String[] args) {
        ArrayQueue<Integer> queue  =new ArrayQueue<>(10);
        for (int i = 0; i < 15; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.getFirst());
        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
    }



}
