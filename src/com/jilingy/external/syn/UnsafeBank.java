package com.jilingy.external.syn;

/**
 * @Description:不安全的取钱
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/5/11
 **/
public class UnsafeBank {
}

//账户
class Account {
    int accountBalance=100;
    String name;

    public Account(int accountBalance, String name) {
        this.accountBalance = accountBalance;
        this.name = name;
    }
}

//银行：模拟取款
class Drawing extends Thread{
    Account account;//账户
    int drawingMoney;
    int nowMoney;
    public Drawing(Account account,int drawingMoney,int nowMoney){
        this.account=account;
        this.drawingMoney=drawingMoney;
        this.nowMoney=nowMoney;
    }

    @Override
    public void run() {
        //判断有没有钱
        if (account.accountBalance-drawingMoney<0){
            System.out.println(Thread.currentThread().getName()+"钱不够了");
            return;

        }
        //卡内余额
        account.accountBalance=account.accountBalance-drawingMoney;
        //手里的钱
        nowMoney=nowMoney+drawingMoney;

    }
}