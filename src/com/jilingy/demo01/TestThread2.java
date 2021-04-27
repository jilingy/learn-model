package com.jilingy.demo01;

/**
 * @Description:创建线程方式2：实现runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/27
 **/
public class TestThread2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("看代码"+i);

        }
    }

    public static void main(String[] args) {
        //创建runnable接口实现类对象
        TestThread2 testThread2 = new TestThread2();
        //创建线程对象，通过线程对象开启我们的线程，代理
        //Thread thread=new Thread(testThread2);
        //thread.start();
        //结合上面两行代码：
        new Thread(testThread2).start();



        //主方法， main线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("学习多线程"+i);

        }
    }
}
