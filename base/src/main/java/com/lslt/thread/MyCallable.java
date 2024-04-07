package com.lslt.thread;

import com.lslt.work.PrimeTask;

import java.util.List;
import java.util.concurrent.Callable;

/**
 * @author lslt
 * @description 实现Callable接口
 * @date 2024/4/7 19:59
 */
public class MyCallable implements Callable<List<Integer>> {


    @Override
    public List<Integer> call() throws Exception {

        PrimeTask task = new PrimeTask(150);
        return task.doTask();
    }
}
