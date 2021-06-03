package com.alen.FunctionalInterface.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
/*
    对字符串进行消费
        消费方式：1、直接打印
                2、字符串反转输出
 */
public class Demo1Consumer {
    public static void method(String name , Consumer<String> consumer){
        consumer.accept(name);
    }

    public static void main(String[] args) {
        method("Alen",(String name)->{
            //直接输出
//            System.out.println(name);
            //对字符串进行反转
            String str = new StringBuffer(name).reverse().toString();
            System.out.println(str);
        });

    }
}
