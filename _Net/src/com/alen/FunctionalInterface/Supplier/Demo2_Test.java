package com.alen.FunctionalInterface.Supplier;

import java.util.function.Supplier;

public class Demo2_Test {
    public static int getMax(Supplier<Integer> supplier){
        return supplier.get();
    }

    public static void main(String[] args) {
        int[] list = {16,2,54,55,3,4,5,6,9};
        int MaxNum = getMax(()->{
           int max=list[0];
            for (int i:list
                 ) {
                if (i>max){
                    max = i;
                }
            }
           return max;
        });
        System.out.println(MaxNum);
    }
}
