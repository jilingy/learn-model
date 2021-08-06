package com.jilingy.external.syn;

/**
 * @Description:不安全的买票
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/5/11
 **/
public class UnsafeTicket {
    public static void main(String[] args) {
        buyTiecket buyTiecket = new buyTiecket();
        new Thread(buyTiecket,"我").start();
        new Thread(buyTiecket,"黄牛").start();
        new Thread(buyTiecket,"其他人").start();
    }

}


class buyTiecket implements Runnable{
    private int ticketNum=10;
    private boolean flag=true;

    @Override
    public void run() {
        //买票
        while (flag){
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //判断是否有票
    private void buy() throws InterruptedException {
        if (ticketNum<0){
            flag=false;
            return;
        }
        //模拟延迟
        Thread.sleep(100);

        //买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNum--);

    }
}