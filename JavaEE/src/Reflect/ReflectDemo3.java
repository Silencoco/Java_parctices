package Reflect;

import domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    //在构造器中设置类的属性（通过类的属性设置到构造器中）
    public static void main(String[] args) throws Exception{
        //获取类
        Class<? extends Person> personClass = Person.class;
        //设置构造器
        Constructor<? extends Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //通过构造器创建对象
        Person person1 = constructor.newInstance("张三丰", 20);
        System.out.println(person1);
        //推荐使用以下 创建构造器对象
        Person person = personClass.newInstance();
        System.out.println(person);
        //暴力反射
        constructor.setAccessible(true);
    }
}
