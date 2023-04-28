package com.circle;

import com.circle.CircleQueue;

public class CircleTest {
    public static void main(String[] args) {
        CircleQueue<Integer> circle = new CircleQueue<Integer>();
        for (int i = 0; i < 8 ; i++) {
            circle.enQueue(i);
        }
        System.out.println(circle);
        circle.enQueue(11);
        circle.enQueue(11);
        System.out.println(circle);
        System.out.println(circle.getCapacity());
        System.out.println(circle.getSize());
        System.out.println(circle.isEmpty());
        System.out.println(circle.getHead());
        circle.deQueue();
        circle.deQueue();
        circle.deQueue();
        circle.deQueue();
        circle.deQueue();
        circle.deQueue();
        circle.deQueue();
        circle.deQueue();
        System.out.println(circle);
    }
}
