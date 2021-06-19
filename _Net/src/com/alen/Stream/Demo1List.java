package com.alen.Stream;

import java.util.ArrayList;

public class Demo1List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("大傻逼申金枫");
        list.add("申木枫");
        list.add("申水枫");
        list.add("申火枫");
        list.add("申土枫枫");
        list.stream().filter(s -> s.startsWith("申")).filter(s->s.length()==3).forEach(System.out::println);
    }
}
