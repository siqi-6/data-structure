package com.array;

import com.linkedList.queque;

public class ArrayQueue<E>  implements queque<E> {

    Array<E> arr ;

    public ArrayQueue(int capacity){
        arr = new Array<>(capacity);
    }

    public ArrayQueue(){
       arr = new Array<>();
    }
    public int getSize(){
        return arr.getSize();
    }

    public  boolean isEmpty(){
        return arr.getSize()==0;
    }
    @Override
    public void enqueue(E value){
        arr.addLast(value);
    }
    @Override
    public  void dequeue(){
        arr.deleteFirst();
    }

    public E getFirst(){
      return   arr.get(0);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: head [");
        for (int i = 0; i < arr.getSize(); i++) {
            sb.append(arr.get(i));
            if(i!=arr.getSize()-1){
                sb.append(", ");
            }
        }
        sb.append("] tail");
        return sb.toString();
    }
}
