package com.circle;

public class CircleQueue<E> {
    private E[] arr;
    private int size;
    private int head;
    private int tail ;

    public CircleQueue() {
        arr = (E[]) new Object[10];
        size = 0;
        head = 0;
        tail = 0 ;
    }

    public CircleQueue(int capacity) {
        arr = (E[]) new Object[capacity + 1];
        size = 0;
        head = 0;
        tail = 0 ;
    }

    public void enQueue(E value) {
        if ((tail+1)%arr.length==head) {
            reSize(arr.length * 2);
        }
        arr[tail] = value;
        tail =(tail+1)%arr.length;
        size++;

    }

    public E deQueue() {
        if(isEmpty()){
            throw new RuntimeException("队列空，没有元素出队");
        }
        E ret = arr[head] ;
        arr[head]=null;
        head = (head + 1) % arr.length;
        size--;
        if (size == getCapacity() / 4&& getCapacity()/2!=0 ) {
            reSize(getCapacity()  / 2);
        }
        return ret;
    }

    public E getHead() {
        return arr[head];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return arr.length-1;
    }

    public boolean isEmpty() {
        if(head==tail){
            return true;
        }
        return false ;
    }

    public void reSize(int length) {
            E[] e = (E[]) new Object[length+1];
            for (int i = 0; i < size; i++) {
                e[i] = arr[(i+head)%arr.length];
            }
            arr = e;
            head = 0 ;
            tail = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Circle:  size= %d , capacity =%d\n", size, getCapacity()));
        sb.append("head [");
        for (int i = head; i!=tail; i=(i+1)%arr.length) {
            sb.append(arr[i]);
            if ((i+1 )%arr.length != tail ) {
                sb.append(", ");
            }

        }
        sb.append("] tail");

        return sb.toString();
    }

}
