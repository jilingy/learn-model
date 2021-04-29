package com.jilingy.demo01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/29
 **/
public class TestSleep3 {
    public static void main(String[] args) {

        //打印系统当前时间
        Date startTime=new Date(System.currentTimeMillis());
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime=new Date(System.currentTimeMillis());//更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
