package com.array;

public class Queue<E> {

    Array<E> arr ;

    public Queue(int capacity){
        arr = new Array<>(capacity);
    }

    public Queue(){
       arr = new Array<>();
    }
    public int getSize(){
        return arr.getSize();
    }

    public  boolean isEmpty(){
        return arr.getSize()==0;
    }
    public void enqueue(E value){
        arr.addLast(value);
    }
    public  void deQueue(){
        arr.deleteFirst();
    }
    public E getFirst(){
      return   arr.get(0);
    }
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
