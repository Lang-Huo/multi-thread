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
                if (queue.isEmpty()){
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
