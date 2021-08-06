package com.jilingy.external.thread;

import java.util.Date;

/**
 * @Description:模拟倒计时
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/29
 **/
public class TestSleep2 {
    public static void main(String[] args) {
        try {
            tenDown();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //模拟倒计时
    public static void tenDown() throws InterruptedException{
        int num=10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num<=0){
                break;
            }
        }
    }
}
