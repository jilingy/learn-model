package com.jilingy.selfstudy.thread;

/**
 * @description:
 * @author: yangjiling
 * @date: 2021-07-23
 **/
public class ThreadBuilder {
    public static void main(String[] args) {
        new ProgrammingThread().start();

    }
}

class ProgrammingThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId());

    }
}
