package com.alen.FunctionalInterface.Function;

import java.util.function.Function;

public class Demo2_andThen {
    /*
        定义一个方法
        参数串一个字符串类型的整数
        参数再传递两个Function接口
            一个泛型使用Function<String,Integer>
            一个泛型使用Function<Integer,String>
     */
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
    public static void main(String[] args) {
        //定义一个字符串类型的整数
        String s = "123";
        change(s,(String str)->{
            return Integer.parseInt(str)+10;
        },(Integer i)->{
            return i+"";
        });
    }
}
