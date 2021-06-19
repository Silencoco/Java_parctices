package Reflect;

import domain.Person;

/**
 * 三种获取Class对象的方式
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        /**
         * 源代码阶段：
         * 1、全类名：将字节码文件加载进内存，返回class对象
         * Class.forname("全类名")
         */
        Class<?> cls1 = Class.forName("domain.Person");
        System.out.println(cls1);
        /**
         *Class类对象阶段（进栈内存阶段）
         * 2、类名.class
         */
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        /**
         * 代码运行阶段
         * 3、对象.getClass()
         */
        Person person = new Person();
        Class<? extends Person> cls3 = person.getClass();
        System.out.println(cls3);

        Boolean a=false;
        if (cls1==cls2&&cls2==cls3&&cls1==cls3){
            a=true;
        }
        System.out.println(a);//返回true
        /**
         * 说明三个对象是同一个地址（对象）
         */

        /**
         *public interface BeanFactory {
         *     //核心方法getBean
         *     Object getBean(String name);
         * }
         *
         * Class b1 = Class.forName("B");
         *         BeanFactory b2 =  (BeanFactory) b1.newInstance();
         *         System.out.println(b2);
         *  只需要使用Class中的forName方法加载一下类就可以了，
         * 可以将这一段代码提出来作为一个工具类方法，
         * 不管有多少类只要实现了该接口我们只要传入需要实例化的路径名就可以实例化，
         * 这样大大节省了我们的代码（注：newInstance实例化对象是只能调用无参构造方法
         */
        Object cls_new = cls1.newInstance();
        System.out.println(cls_new);
    }
}