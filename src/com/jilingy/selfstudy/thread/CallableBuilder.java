package com.jilingy.selfstudy.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: yangjiling
 * @date: 2021-07-30
 **/
public class CallableBuilder {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableThread callableThread = new CallableThread();
        FutureTask<Integer> result = new FutureTask<>(callableThread);
        Thread thread1 = new Thread(result, "线程11111111     ");
        thread1.start();
        System.out.println("结果：" + result.get());
    }
}

class CallableThread implements Callable<Integer> {
    @Override
    public Integer call() {
        int target = 0;
        for (int i = 0; i < 100; i++) {
            target++;
            System.out.println("当前线程： " + Thread.currentThread().getName() + target);
        }
        return target;
    }
}
