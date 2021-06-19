package Reflect;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
//        Constructor<Person> constructor = personClass.getConstructor();
        Person person = new Person();
        Method eat = personClass.getMethod("eat");

        eat.invoke(person);
        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person,"noddle");

        Method[] methods = personClass.getMethods();
        for(Method method:methods){
            System.out.println(method);
        }
    }
}
