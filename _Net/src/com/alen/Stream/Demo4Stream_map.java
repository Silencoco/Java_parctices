package com.alen.Stream;

import java.util.stream.Stream;
//使用map将字符串类型的数字映射为整型的数字
public class Demo4Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        //将String转换为integer,并遍历输出
//        stream.map(i ->Integer.parseInt(i)).forEach(System.out::println);
        stream.map(Integer::parseInt).forEach(System.out::println);
//        stream.map(s->String.valueOf(s)).forEach(System.out::println);
        stream.map(String::valueOf).forEach(System.out::println);
        /**
         * 注意：Stream流只能用一次，否则会报异常：
         * stream has already been operated upon or closed
         */
    }
}
