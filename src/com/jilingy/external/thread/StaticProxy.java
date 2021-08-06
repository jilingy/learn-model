package com.jilingy.external.thread;

//静态代理模式总结：
//真实对象和代理对象都需要实现同一个接口
//代理对象要代理真实角色
//好处：代理对象可以做很多真实对象做不了的事
//真是对象专注做自己的事情
//静态代理就是线程的底部实现原理

/**
 * @Description:静态代理
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/27
 **/
public class StaticProxy {
    public static void main(String[] args) {
        //Thread代理runnable接口，调用了一个start方法
        //new Thread(()-> System.out.println("我爱你")).start();

        WeddingCompany weddingCompany= new WeddingCompany(new You());
        weddingCompany.HappyMarry();
    }
}

interface Marry{
    void HappyMarry();
}

//真实角色
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("开心");
    }
}

//代理角色，帮助你结婚
class WeddingCompany implements Marry{
    //真实目标角色
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这是真是对象调用的结婚
        after();
    }

    private void before() {
        System.out.println("结婚之前，布置现场");
    }

    private void after() {
        System.out.println("结婚之后，收尾款");
    }

}