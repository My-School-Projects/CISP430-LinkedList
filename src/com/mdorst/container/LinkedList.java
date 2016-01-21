package com.mdorst.container;

import com.mdorst.container.implementation.Node;

/**
 * Michael Dorst
 * CISP 430
 */
public class LinkedList<T> {
    private Node<T> frontNode;
    private Node<T> backNode;

    public void pushFront(T obj) {
        frontNode = frontNode.prev();
        frontNode.obj = obj;
    }
    public void pushBack(T obj) {
        backNode.obj = obj;
        backNode = backNode.next();
    }

    public T popFront() {
        if (frontNode != backNode) {
            frontNode = frontNode.next();
            return frontNode.prev().obj;
        } else {
            return null;
        }
    }
    public T popBack() {
        if (backNode != frontNode) {
            backNode = backNode.prev();
            return backNode.obj;
        } else {
            return null;
        }
    }

    public LinkedList() {
        frontNode = backNode = new Node<>();
    }
}
