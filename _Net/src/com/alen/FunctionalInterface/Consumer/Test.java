package com.alen.FunctionalInterface.Consumer;

import javax.print.attribute.standard.PrinterInfo;
import java.util.function.Consumer;

/*
    格式化打印信息
 */
public class Test {
    public static void method(String[] str, Consumer<String> con1,Consumer<String> con2){
        //遍历字符串，并消费
        for (String messgae : str) {
            con1.andThen(con2).accept(messgae);
        }
    }
    public static void main(String[] args) {
        String[] arr = {"alen,man","jams,man","angle,woman"};
        method(arr,(message)->{
            String name = message.split(",")[0];
            System.out.print("姓名："+name);
        },(message)->{
            String sex = message.split(",")[1];
            System.out.print("\t性别："+sex);
            System.out.println();
        });
    }
}
