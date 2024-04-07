package com.lslt;

/**
 * @author lslt
 * @description
 * @date 2024/4/6 22:28
 */
public class Application {

    public static void main(String[] args) {

        //1.继承Thread类
//        InheritThread thread = new InheritThread("t1");
//        thread.start();

        //2.实现Runnable接口

//        Thread t = new Thread(new MyRunnable(),"t2");
//        t.start();

        //3.使用executor框架创建线程
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        for (int i = 0; i < 5; i++) {
//            executorService.execute(new MyRunnable());
//        }
//        executorService.shutdown();
//
//        //4.实现Callable 接口
//        try {
//            ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
//            Future<List<Integer>> future = executor.submit(new MyCallable());
//            List<Integer> result = future.get();
//            for (Integer num : result) {
//                System.out.println(num);
//            }
//            executor.shutdown();
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }


        Thread thread = new Thread(()->{
            System.out.println("执行thread中所在线程组的名字："+Thread.currentThread().getThreadGroup().getName());
            System.out.println("执行thread线程的名字："+Thread.currentThread().getName());
        });
        thread.start();
        System.out.println("执行main方法所在线程组的名字：" +Thread.currentThread().getThreadGroup().getName());
        System.out.println("执行main方法线程的名字：" +Thread.currentThread().getName());

    }
}
