package com.linkedList;

import com.array.ArrayQueue;
import com.circle.CircleQueue;

public class Comparator {
    public static void main(String[] args) {
        LinkedlistQueue<Integer> integerLinkedlistQueue = new LinkedlistQueue<Integer>();
        System.out.println(testQueue(integerLinkedlistQueue, 100000)+"s 链表");
        ArrayQueue<Integer> integers = new ArrayQueue<Integer>();
        System.out.println(testQueue( integers,100000)+"s 数组");
        CircleQueue<Integer> integerCircleQueue = new CircleQueue<>();
        System.out.println(testQueue(integerCircleQueue,100000)+"s 循环");
    }
    public static long testQueue(queque<Integer> queue, int opcCount ){
        long start = System.nanoTime();
        for (int i = 0; i < opcCount; i++) {
            queue.enqueue(i);
        }
        for (int i = 0; i < opcCount; i++) {
           queue.dequeue();
        }
        long end = System.nanoTime();
        return  (end-start)/1000000000;

    }
}
