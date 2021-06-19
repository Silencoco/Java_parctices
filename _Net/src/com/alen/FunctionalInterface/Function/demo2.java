package com.alen.FunctionalInterface.Function;

import java.util.function.Function;

public class demo2 {
    public static void change(Integer i, Function<Integer,String> fun){
        String s = fun.apply(i);
        System.out.println(s);
        if (s instanceof String){
            System.out.println("String");
        }

    }

    public static void main(String[] args) {
        int i = 1234;
        change(i,(Integer integer)->{
            return integer.toString(i);
        });
    }
}
