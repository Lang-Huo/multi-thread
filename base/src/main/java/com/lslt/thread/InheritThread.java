package com.lslt.thread;

import com.lslt.work.PrimeTask;

import java.util.List;

/**
 * @author lslt
 * @description 继承Thread类重写run方法
 * @date 2024/4/6 22:33
 */
public class InheritThread extends Thread{


    public InheritThread(){

    }

    public InheritThread(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("任务开始");
        PrimeTask task = new PrimeTask(200);
        List<Integer> result = task.doTask();
        for (Integer num : result) {
            System.out.println(num);
        }
        System.out.println("任务结束");
    }

}
