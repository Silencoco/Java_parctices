package com.alen.FunctionalInterface.Function;

import java.util.function.Function;

public class Demo3Test {
    /**
     *
     * @param str 传入字符串
     * @param fun1 将字符串通过’，‘分割 将年龄返回
     * @param fun2 将年龄的字符串类型转换为Integer类型
     * @param fun3 对年龄进行运算
     * @return
     */
    public static int change(String str, Function<String,String> fun1, Function<String,Integer> fun2, Function<Integer,Integer> fun3){
        return fun1.andThen(fun2).andThen(fun3).apply(str);
    }

    public static void main(String[] args) {
        String str = "石头人,90";
        int num=change(str,(String s)->{
            return s.split(",")[1];
        },(String s)->{
            return Integer.parseInt(s);
        },(Integer i)->{
            return i+100;
        });
        System.out.println(num);
    }
}
