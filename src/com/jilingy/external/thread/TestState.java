package com.jilingy.external.thread;

/**
 * @Description:观察测试线程的状态
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/5/8
 **/
public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("///////");
        }
        });

        //观测状态

        Thread.State state=thread.getState();
        System.out.println(state);//NEW

        //观察启动后
        thread.start();
        state=thread.getState();
        System.out.println(state);//RUNNABLE
        while (state!=Thread.State.TERMINATED){
            Thread.sleep(100);
            state=thread.getState();
            System.out.println(thread.getState());
        }
        //死亡后的线程不能再启动
    }
}
