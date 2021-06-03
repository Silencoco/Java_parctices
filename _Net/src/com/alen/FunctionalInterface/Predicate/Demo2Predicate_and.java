package com.alen.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Demo2Predicate_and {
    public static boolean checkString(String str, Predicate<String> predicate1,Predicate<String> predicate2){
//        return predicate1.test(str)&& predicate2.test(str);
        return predicate1.and(predicate2).test(str);//等价于上面
    }

    public static void main(String[] args) {
        //判断字符串长度是否大于5且是否包含a
        String str = "helloa";
        boolean b = checkString(str, s -> {
            return s.length() > 5;
        }, s -> {
            return s.contains("a");
        });
        System.out.println(b);
    }
}
