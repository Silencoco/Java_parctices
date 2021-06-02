package com.alen.Lambda.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 函数式接口作为方法的返回值类型案例
 */
public class Demo02Comparator {
    public static Comparator<String> newComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length()-o1.length();
//            }
//        };
        return (o1,o2)->o1.length()-o2.length();
    }

//    public static void main(String[] args) {
//        String[] array = {"aasd","f","dasfdafds","b"};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array,newComparator());
//        System.out.println(Arrays.toString(array));
//    }

    public static void main(String[] args) {
        String[] array = {"aasd","f","dasdss","b"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array,newComparator());
        System.out.println(Arrays.toString(array));
    }
}
