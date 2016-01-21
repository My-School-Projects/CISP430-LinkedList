package com.mdorst.container;

import com.mdorst.container.implementation.Node;

/**
 * Michael Dorst
 * CISP 430
 */
class LinkedListBase<T> {
    protected Node<T> frontNode;
    protected Node<T> backNode;

    protected void pushFront(T obj) {
        frontNode = frontNode.prev();
        frontNode.obj = obj;
    }
    protected void pushBack(T obj) {
        backNode.obj = obj;
        backNode = backNode.next();
    }

    protected T popFront() {
        if (frontNode != backNode) {
            frontNode = frontNode.next();
            return frontNode.prev().obj;
        } else {
            return null;
        }
    }
    protected T popBack() {
        if (backNode != frontNode) {
            backNode = backNode.prev();
            return backNode.obj;
        } else {
            return null;
        }
    }

    protected LinkedListBase() {
        frontNode = backNode = new Node<>();
    }
}
