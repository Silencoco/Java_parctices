package com.alen.FunctionalInterface;

/**
 * 函数式接口的使用，一般可以作为方法的参数和返回值类型
 */
public class demo {
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }


    public static void main(String[] args) {
        //调用show方法。方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的抽象方法");
            }
        });
        //调用show方法，方法的参数是一个函数式接口，所以我们可以Lambda表达式
        show(()->{//小括号里写参数，箭头指向大括号
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        //简书Lambda表达式，大括号只有一行代码就去掉大括号、分号以及return.
        show(()-> System.out.println("简化后的Lambda"));
    }
}
