package com.jilingy.demo01;

/**
 * @Description: 测试stop
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/28
 **/
    //1.建议线程正常停止-》利用次数，建议死循环
    //2。建议使用标识为-？设置一个标识为
    //3。不要使用stop，destroy等jdk不建议使用的方法

public class TestStop implements Runnable{
    //设置一个标识为
    private boolean flag=true;

    @Override
    public void run() {
        int i =0;
        while(flag){
            System.out.println("run...."+i++);
        }
    }

    public void stop(){
        this.flag=false;
    }

    public static void main(String[] args) {
        TestStop testStop=new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i <1000 ; i++) {
            System.out.println("main"+i);
            if (i==900){
                //diaoyong stop方法切换标识为，让线程停止
                testStop.stop();
                System.out.println("线程停止");
            }
        }
    }
}
