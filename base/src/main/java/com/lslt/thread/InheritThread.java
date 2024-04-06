package com.lslt.thread;

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
        //求 100 中的所有的素数
        //素数：大于1的整数，只能被1和它本身整除的数
        System.out.println("任务执行开始");
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        System.out.println("任务结束");
//        String name = Thread.currentThread().getName();
//        System.out.printf("thread name :%s",name);
    }


    private boolean isPrime(int num){

        if(num <= 1){
            return false;
        }
        for (int i = num - 1; i > 1; i--) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
