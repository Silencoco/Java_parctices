package com.alen.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Demo1Predicate {
//    public static void method(Predicate<String> pre){
//        boolean test = pre.test("str");
//        System.out.println("字符串长度大于5吗？"+test);
//    }

    public static boolean method2(String str,Predicate<String> predicate){
        return predicate.test(str);
    }
    public static void main(String[] args) {
//        method(s-> s.length()>5);
        String string = "Test";
        boolean b=method2(string,s -> string.length() > 5);
        System.out.println("字符串的长度大于5吗？"+b);
    }
}
