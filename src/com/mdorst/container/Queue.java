package com.mdorst.container;

import com.mdorst.container.implementation.QueueNode;

/**
 * Michael Dorst
 * CISP 430
 */
public class Queue<T> {
    private QueueNode<T> frontNode;
    private QueueNode<T> backNode;

    public void push(T obj) {
        backNode.obj = obj;
        backNode = backNode.next();
    }

    public T pop() {
        if (frontNode != backNode) {
            frontNode = frontNode.next();
            return frontNode.prev().obj;
        } else {
            return null;
        }
    }
    public Queue() {
        frontNode = backNode = new QueueNode<>();
    }
}
