package com.alen.Lambda;

/**
 * 优化日志案例
 * 特点：
 *      延迟加载
 * 使用前提：
 *      必须存在函数式接口
 *
 * 总计：使用Lambda表达式：通过调用函数式接口作为方法参数
 * 在主方法使用Lambda表达式进行实现，不满足条件的代码不会运行
 * 此方法相对于匿名
 * 面对多次使用时，节省性能的浪费，
 */
public class Demo02Lambda {
    public static void showLog(int level,MessageBuilder mb){
        if (level == 1){
            System.out.println(mb.BuilderMessage());
        }
    }

    public static void main(String[] args) {
        String message1 = "hello";
        String message2 = "world";
        showLog((1),()->{
            return message1+message2;
        });
        showLog((2),()->{
            System.out.println("不满足条件输出语句不执行");
            return message1+message2;
        });

    }
}
