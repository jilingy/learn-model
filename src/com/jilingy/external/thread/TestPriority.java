package com.jilingy.external.thread;

/**
 * @Description:测试线程的优先级
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/5/10
 **/
public class TestPriority{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
        MyPriority myPriority=new MyPriority();
        Thread t1 =new Thread(myPriority);
        Thread t2 =new Thread(myPriority);
        Thread t3 =new Thread(myPriority);
        Thread t4 =new Thread(myPriority);
        //先设置优先级，再启动
        t1.start();
        t2.setPriority(1);
        t2.start();
        t3.setPriority(4);
        t3.start();
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.start();

    }

}

class MyPriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
    }
}
