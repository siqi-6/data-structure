package com.linkedList;

import java.util.Queue;

public class LinkedlistQueue<E> implements queque<E> {

    private linkedList<E> list ;
    private  int size ;
    public LinkedlistQueue(){
        this.list =new linkedList<>();
    }

    public E peek() {
        return list.getFirst() ;
    }


    public int getSize() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E value) {
        list.addLast(value);
    }

    @Override
    public void dequeue() {
        list.deleteFirst();
    }

    @Override
    public String toString() {
        return "LinkedlistQueue{" +
                "list=" + list +
                ", size=" + size +
                '}';
    }
}
