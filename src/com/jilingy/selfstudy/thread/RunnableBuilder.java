package com.jilingy.selfstudy.thread;

/**
 * @description:
 * @author: yangjiling
 * @date: 2021-07-30
 **/
public class RunnableBuilder {
    public static void main(String[] args) {
        RunnableThread runnableThread = new RunnableThread();
        Thread thread = new Thread(runnableThread);
        thread.start();
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId());
    }
}
