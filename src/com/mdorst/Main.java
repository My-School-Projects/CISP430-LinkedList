package com.mdorst;

import com.mdorst.container.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
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
    }
}
