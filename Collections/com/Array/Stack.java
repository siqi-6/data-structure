package com.Array;

public class Stack<E> {

    private  Array<E>  arr;

    public Stack(int capacity){
         this.arr = new Array<>(capacity);
    }
    public Stack(){
        this.arr = new Array<>();
    }

    public int getSize(){
        return arr.getSize() ;

    }
    public  boolean isEmpty(){
        return arr.getSize()==0;
    }

    public  void push(E value){
        arr.addLast(value);
    }

    public  void pop(){
        arr.deleteLast();
    }

    public E peek(){
      return  arr.get(arr.getSize()-1);
    }



    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("stack: [");
        for (int i = 0; i < arr.getSize(); i++) {
            if(i== arr.getSize()-1){
                sb.append(arr.get(i));
            }else {
                sb.append(arr.get(i)).append(" ,");
            }
        }
        sb.append("] top");
        return sb.toString();
    }
    
}
