package com.alen.FunctionalInterface.Consumer;

import java.util.Locale;
import java.util.function.Consumer;

public class Demo2AndThen {
    public static void method1(String s, Consumer<String> con1,Consumer<String> con2){
//        con1.andThen(con2).accept(s);
//        con1.accept(s);
//        con2.accept(s);
        //将两个consumer接口连接到一起再进行消费（先消费con1,再消费con2）
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method1("hello",(t)->{
            System.out.println(t.toUpperCase(Locale.ROOT));
        },(t)->{
            System.out.println(t.toLowerCase(Locale.ROOT));
        });
    }
}
