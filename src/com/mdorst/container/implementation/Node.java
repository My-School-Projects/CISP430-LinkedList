package com.mdorst.container.implementation;

/**
 * Michael Dorst
 * CISP 430
 */
public class Node<T> {
    public T obj;

    private Node<T> next;
    private Node<T> prev;

    public Node<T> next() {
        if (next == null) {
            next = new Node<>();
            next.prev = this;
        }
        return next;
    }
    public Node<T> prev() {
        if (prev == null) {
            prev = new Node<>();
            prev.next = this;
        }
        return prev;
    }
}
