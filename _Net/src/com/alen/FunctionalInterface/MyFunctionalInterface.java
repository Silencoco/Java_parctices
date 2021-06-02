package com.alen.FunctionalInterface;

/**
 * 函数式接口：
 *      有且只有一个抽象方法的接口
 *      可以包含其他方法（默认、静态、私有）
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void method();
}
