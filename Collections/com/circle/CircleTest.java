package com.circle;

import com.circle.CircleQueue;

public class CircleTest {
    public static void main(String[] args) {
        CircleQueue<Integer> circle = new CircleQueue<Integer>();
        for (int i = 0; i < 8 ; i++) {
            circle.enqueue(i);
        }
        System.out.println(circle);
        circle.enqueue(11);
        circle.enqueue(11);
        System.out.println(circle);
        System.out.println(circle.getCapacity());
        System.out.println(circle.getSize());
        System.out.println(circle.isEmpty());
        System.out.println(circle.getHead());
        circle.dequeue();
        System.out.println(circle);
    }
}
