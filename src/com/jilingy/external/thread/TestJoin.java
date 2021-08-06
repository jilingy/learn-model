package com.jilingy.external.thread;

/**
 * @Description:测试join方法，插队
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/29
 **/
public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println("vip线程"+i);
        }
    }

    public static void main(String[] args) {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
        //主线程
        for (int i = 0; i <1000 ; i++) {
            if(i==200){
                try {
                    thread.join();//插队
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("ain线程"+i);
            
        }

    }
}
