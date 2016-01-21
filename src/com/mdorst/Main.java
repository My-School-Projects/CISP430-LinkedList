package com.mdorst;

import com.mdorst.container.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.popFront()); // null
        System.out.println(list.popFront()); // null
        list.pushBack(10);
        list.pushBack(5);
        list.pushBack(35);
        System.out.println(list.popFront()); // 10
        System.out.println(list.popFront()); // 5
        list.pushBack(100);
        list.pushBack(65);
        System.out.println(list.popFront()); // 35
        System.out.println(list.popFront()); // 100
        System.out.println(list.popFront()); // 65
        System.out.println(list.popFront()); // null
        System.out.println(list.popFront()); // null
        list.pushBack(50);
        System.out.println(list.popFront()); // 50
        System.out.println(list.popFront()); // null
        System.out.println();

        LinkedList<Integer> stack = new LinkedList<>();
        System.out.println(stack.popFront()); // null
        System.out.println(stack.popFront()); // null
        stack.pushFront(10);
        stack.pushFront(5);
        stack.pushFront(35);
        System.out.println(stack.popFront()); // 35
        System.out.println(stack.popFront()); // 5
        stack.pushFront(100);
        stack.pushFront(65);
        System.out.println(stack.popFront()); // 65
        System.out.println(stack.popFront()); // 100
        System.out.println(stack.popFront()); // 10
        System.out.println(stack.popFront()); // null
        System.out.println(stack.popFront()); // null
        stack.pushFront(15);
        System.out.println(stack.popFront()); // 15
        System.out.println(stack.popFront()); // null
        System.out.println();

        System.out.println(stack.popBack()); // null
        System.out.println(stack.popBack()); // null
        stack.pushBack(10);
        stack.pushBack(5);
        stack.pushBack(35);
        System.out.println(stack.popBack()); // 35
        System.out.println(stack.popBack()); // 5
        stack.pushBack(100);
        stack.pushBack(65);
        System.out.println(stack.popBack()); // 65
        System.out.println(stack.popBack()); // 100
        System.out.println(stack.popBack()); // 10
        System.out.println(stack.popBack()); // null
        System.out.println(stack.popBack()); // null
        stack.pushBack(15);
        System.out.println(stack.popBack()); // null
    }
}
