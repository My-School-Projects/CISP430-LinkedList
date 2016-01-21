package com.mdorst.container;

/**
 * Michael Dorst
 * CISP 430
 */
public class Stack<T> extends LinkedListBase<T> {
    public void push(T obj) {
        super.pushBack(obj);
    }
    public T pop() {
        return super.popBack();
    }
}
