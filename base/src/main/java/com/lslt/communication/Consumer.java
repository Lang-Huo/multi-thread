package com.lslt.communication;

import java.util.Queue;
import java.util.Random;

/**
 * @author lslt
 * @description 消费者
 * @date 2024/4/7 23:12
 */
public class Consumer implements Runnable {

    private final Queue<Integer> queue;

    public Consumer(Queue<Integer> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while (true){
            synchronized (queue){
                //消费者休息
                //如果有多个消费者，当生产者生产一个消息后，唤醒消费者，但是被其他消费者消费了，代码会从wait方法处继续往下执行，导致消费了不存在的消息。
                //因此需要循环判断，是否还有消息，如果没有就继续等待。生产者也是类似。只要生产者和消费者者总数大于2就会出现这样的情况。
                while (queue.isEmpty()){
                    System.out.println(Thread.currentThread().getName()+"队列已空，等待生产者生产...");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value = queue.poll();
                System.out.println(Thread.currentThread().getName() + "消费者，消费的消息："+value);

                queue.notify();
            }
            try {
                int timeout = new Random().nextInt(1000);
//                    System.out.println(Thread.currentThread().getName() + "消费者休息时间："+timeout);
                Thread.sleep(timeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
