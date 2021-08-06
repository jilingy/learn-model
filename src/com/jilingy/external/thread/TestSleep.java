package com.jilingy.external.thread;

/**
 * @Description:模拟网络延时
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/28
 **/
//模拟网络掩饰：放大问题的发生性

public class TestSleep implements Runnable{
    private int ticketNum =20;

    @Override
    public void run() {
        while (true){
            if (ticketNum<0){
                break;
            }

            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNum-- +"张票");
        }
    }

    public static void main(String[] args) {
        TestSleep ticket = new TestSleep();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"老师").start();
        new Thread(ticket,"黄牛党").start();
    }
}
