package com.jilingy.external.thread;

/**
 * @Description: 测试礼让线程，礼让不一定成功
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/29
 **/
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();

    }
}
class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止");
    }
}