package com.alen.Lambda;

/**
 * 日志案例
 *
 * 发现以下代码存在的一些性能浪费的问题周用 showLog方法
 * 传递的第二个参数是一个拼接后的字符串
 * 先把字符串拼接好然后在调用 showLog方法showLog方法
 * 如果传递的日志等级不是1级那么就不会是如此拼接后的字符串
 * 所以感觉字符串就白拼接了，存在了浪费
 */
public class Demo01Logger {
    //根据日志级别，显示日志信息
    public static void showLog(int level,String message){
        if (level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String message1 = "hello";
        String message2 = "world";
        showLog(2,message1+message2);
    }
}
