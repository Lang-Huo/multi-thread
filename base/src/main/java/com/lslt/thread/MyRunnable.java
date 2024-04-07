package com.lslt.thread;

import com.lslt.work.PrimeTask;

import java.util.List;

/**
 * @author lslt
 * @description 实现Runnable接口
 * @date 2024/4/7 19:41
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"任务开始");
        PrimeTask task = new PrimeTask();
        List<Integer> result = task.doTask();
        for (Integer num : result) {
            System.out.println(num);
        }
        System.out.println(Thread.currentThread().getName()+"任务结束");
    }
}
