package com.lslt.communication;

import java.util.Queue;
import java.util.Random;

/**
 * @author lslt
 * @description 生产者
 * @date 2024/4/7 23:04
 */
public class Producer implements Runnable{
    private final Queue<Integer> queue;
    private final int CAPACITY;

    public Producer(Queue<Integer> queue,int capacity){
        this.queue = queue;
        this.CAPACITY = capacity;
    }

    @Override
    public void run() {
        int value = 0;
        while (true){
            synchronized (queue){
                //生产者等待
                while (queue.size() == CAPACITY){
                    System.out.println(Thread.currentThread().getName()+"队列已满，等待消费者消费...");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + "生产者生产数据：" + ++value);
                queue.offer(value);
                //唤醒消费者
                System.out.println(Thread.currentThread().getName()+"队列容量："+queue.size());

                queue.notify();
            }
            try {
                int timeout = new Random().nextInt(1000);
//                    System.out.println(Thread.currentThread().getName() + "生产者休息时间："+timeout);
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
