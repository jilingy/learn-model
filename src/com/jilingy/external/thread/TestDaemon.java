package com.jilingy.external.thread;

/**
 * @Description: 测试守护线程
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/5/10
 **/


public class TestDaemon {
    public static void main(String[] args) {
        God god=new God();
        People you = new People();
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();//守护线程
        new Thread(you).start();//用户线程启动


    }
}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("守护线程");
        }
    }
}

class People implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <36500 ; i++) {
            System.out.println("开心");
        }
        System.out.println("结束");

    }
}