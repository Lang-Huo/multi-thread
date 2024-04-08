package com.lslt.communication;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lslt
 * @description
 * @date 2024/4/7 23:19
 */
public class Test {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Producer producer = new Producer(queue, 5);
        Producer producer2 = new Producer(queue, 5);
        Consumer consumer = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);



        Thread producerThread = new Thread(producer,"producer1");
        Thread producerThread2 = new Thread(producer2,"producer2");
        Thread consumerThread = new Thread(consumer,"consumer1");
        Thread consumerThread2 = new Thread(consumer2,"comsumer2");

        producerThread.start();
        producerThread2.start();
        consumerThread.start();
        consumerThread2.start();

    }
}
