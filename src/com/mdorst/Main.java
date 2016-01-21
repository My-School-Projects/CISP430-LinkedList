package com.mdorst;

import com.mdorst.container.LinkedList;
import com.mdorst.container.Queue;
import com.mdorst.container.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("LinkedList");
        System.out.println(list.popBack()); // null
        System.out.println(list.popBack()); // null
        list.pushFront(10);
        list.pushFront(5);
        list.pushFront(35);
        System.out.println(list.popBack()); // 10
        System.out.println(list.popBack()); // 5
        list.pushFront(100);
        list.pushFront(65);
        System.out.println(list.popBack()); // 35
        System.out.println(list.popBack()); // 100
        System.out.println(list.popBack()); // 65
        System.out.println(list.popBack()); // null
        System.out.println(list.popBack()); // null
        list.pushFront(50);
        System.out.println(list.popBack()); // 50
        System.out.println(list.popBack()); // null
        System.out.println();

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

        Queue<Integer> queue = new Queue<>();
        System.out.println("Queue");
        System.out.println(queue.pop()); // null
        System.out.println(queue.pop()); // null
        queue.push(10);
        queue.push(5);
        queue.push(35);
        System.out.println(queue.pop()); // 10
        System.out.println(queue.pop()); // 5
        queue.push(100);
        queue.push(65);
        System.out.println(queue.pop()); // 35
        System.out.println(queue.pop()); // 100
        System.out.println(queue.pop()); // 65
        System.out.println(queue.pop()); // null
        System.out.println(queue.pop()); // null
        queue.push(50);
        System.out.println(queue.pop()); // 50
        System.out.println(queue.pop()); // null
        System.out.println();

        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack");
        System.out.println(stack.pop()); // null
        System.out.println(stack.pop()); // null
        stack.push(10);
        stack.push(5);
        stack.push(35);
        System.out.println(stack.pop()); // 35
        System.out.println(stack.pop()); // 5
        stack.push(100);
        stack.push(65);
        System.out.println(stack.pop()); // 65
        System.out.println(stack.pop()); // 100
        System.out.println(stack.pop()); // 10
        System.out.println(stack.pop()); // null
        System.out.println(stack.pop()); // null
        stack.push(15);
        System.out.println(stack.pop()); // 15
        System.out.println(stack.pop()); // null
        System.out.println();
    }
}
