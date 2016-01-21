package com.mdorst.container.implementation;

/**
 * Michael Dorst
 * CISP 430
 */
public class QueueNode<T> {
    public T obj;

    private QueueNode<T> next;
    private QueueNode<T> prev;

    public QueueNode<T> next() {
        if (next == null) {
            next = new QueueNode<>();
            next.prev = this;
        }
        return next;
    }
    public QueueNode<T> prev() {
        return prev;
    }
}
