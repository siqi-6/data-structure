package com.linkedList;

public interface stack<E> {
    void push(E value);
    void pop();
    E peek();
    boolean isEmpty();
    int getSize();
}
