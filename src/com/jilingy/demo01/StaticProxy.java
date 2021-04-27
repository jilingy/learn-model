package com.jilingy.demo01;

/**
 * @Description:
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/27
 **/
public class StaticProxy {
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
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之前，布置现场");
    }

    private void before() {
        System.out.println("结婚之后，收尾款");
    }

}