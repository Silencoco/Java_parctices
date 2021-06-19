package com.alen.FunctionalInterface.Function;

import java.util.function.Function;

public class Demo1Function {
    public static void change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
//        change(s,(String str)->{
//            return Integer.parseInt(str);
//        });
        Integer integer = Integer.parseInt(s);
        if (integer instanceof  Integer){
            System.out.println("Integer");
            System.out.println(integer);
        }
    }
}
