package Reflect;

import domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Field[] fields = personClass.getFields();//获取所有public修饰的成员变量
        for(Field field:fields){
            System.out.println(field);
        }
        System.out.println("===================");
        //获取单个成员变量
        Field a = personClass.getField("a");
        System.out.println(a);
        Person person = new Person();
        //通过对象获取a的值
        Object value = a.get(person);
        System.out.println(value);
        a.set(person,"属性a 的value");//注意在设置的时候要写toString
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println(field);
        }
        a.setAccessible(true);//设置暴力反射：如果成员变量不是public时，会报访问异常，设置暴力反射后即可访问
    }
}
