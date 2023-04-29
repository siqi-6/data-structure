package com.linkedList;

import com.array.Stack;

public class linkedListStack<E> implements stack<E> {

   private  linkedList<E> list ;

   private int size ;

   public  linkedListStack(){
       this.list = new linkedList<>();
   }

    @Override
    public int getSize() {
     return size;
    }

    @Override
    public boolean isEmpty() {
       return size==0 ;
    }

    @Override
    public E peek() {
     return   list.getFirst();
    }

    @Override
    public void pop() {
        list.deleteFirst();
    }

    @Override
    public void push(E value) {
        list.addFirst(value);
    }

    @Override
    public String toString() {
        return "linkedListStack{" +
                "list=" + list +
                ", size=" + size +
                '}';
    }
}
