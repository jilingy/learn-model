package com.jilingy.demo01;

/**
 * @Description:继承Thread类,重写run方法，调用star线程,交替执行
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/26
 **/

//总结：线程开启不一定立即执行，由cpu调度安排
public class TestThread1 extends Thread{
    @Override
    public void run() {
        //run方法线程体
        //super.run();
        for (int i = 0; i <10 ; i++) {
            System.out.println("线程"+i);

        }
    }

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        testThread1.start();


        //主方法， main线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("学习多线程"+i);

        }
    }
}
