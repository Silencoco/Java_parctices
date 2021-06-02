package com.alen.Lambda.Test;

/**
 * 函数式接口作为方法的参数案例
 */
public class Demo01Runnable {
    public static void StartTread(Runnable runnable){
        new Thread(runnable).start();
    }

    public static void main(String[] args) {
//        StartTread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("线程启动了");
//            }
//        });
        //使用Lambda表达式
        StartTread(()-> System.out.println("线程"+Thread.currentThread().getName()+"启动了"));
    }
}
