package com.alen.FunctionalInterface.Inter;

public class demo {
    public static void doSomething(Inter1 inter1){
        inter1.method1();
    }

    public static void main(String[] args) {
        doSomething(()->{
            System.out.println("已执行");
        });
    }
}
