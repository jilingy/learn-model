package com.jilingy.demo01;

/**
 * @Description: 带参数的landab
 * @Author: yangjiling
 * @Email: jilingy@foxmail.com
 * @Date: 2021/4/28
 **/
public class TestLambda2 {
    public static void main(String[] args) {
        //ILove love =(int num) ->{
        //        System.out.println("I Love u --> "+num); };

        //简化1：去掉了参数类型
        //love=(num)->{
        //   System.out.println("I Love u --> "+num);
        //};

//        简化2：简化括号
//        love=num -> { System.out.println("I Love u --> "+num);
//        };
        ILove love=null;

        //简化3：去掉花括号
        love=num -> System.out.println("I Love u --> "+num);
        love.love(520);
        //总结：
            //lambda只能有一行代码的情况下，才能简化成为一行
            //如果有多行，那么就用代码块包裹。
            //前提是函数式接口
            //多个参数，也可以去掉多个参数类型，要去掉都去掉，都加上括号

    }
}


interface ILove{
    void love(int num);
}
