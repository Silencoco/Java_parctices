package com.alen.FunctionalInterface.Supplier;

import java.util.function.Supplier;

public class Demo1 {
    public static String getString(Supplier<String> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        String str1 = "Message1";
        String str2 = "Message2";
        System.out.println(getString(()->str1+str2));
    }
}
