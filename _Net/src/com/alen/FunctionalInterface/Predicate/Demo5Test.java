package com.alen.FunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo5Test {
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        //定义集合存储过滤后的信息
        ArrayList<String> list = new ArrayList<>();
        for (String s: arr
             ) {
            boolean b = pre1.and(pre2).test(s);
            if (b){
                list.add(s);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","马尔扎哈,男","古力娜扎,女","阿丽塔,女"};
        ArrayList<String> filter = filter(array, (String s) -> {
            return s.split(",")[1].equals("女");
        }, (String s) -> {
            return s.split(",")[0].length() == 4;
        });
        for (String s: filter
             ) {
            System.out.println(s);
        }
    }
}
