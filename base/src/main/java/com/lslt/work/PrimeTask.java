package com.lslt.work;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lslt
 * @description 计算给定一个整数，求出这个整数范围内的所有素数
 * @date 2024/4/7 19:42
 */
public class PrimeTask {

    private final int defaultNumber = 100;

    private int number = defaultNumber;


    public PrimeTask(){

    }

    public PrimeTask(int number){
        this.number = number;
    }

    public List<Integer> doTask(){
        List<Integer> result = new ArrayList<>();
        //求 100 中的所有的素数
        //素数：大于1的整数，只能被1和它本身整除的数
        for (int num = 0; num < number; num++) {
            if (isPrime(num)){
                result.add(num);
            }
        }
        return result;
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
