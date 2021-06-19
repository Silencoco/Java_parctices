package domain;

public class Person {
    private String name;
    public int age;
    public String a;
    public String b;
    public String c;
    public String d;

    public void eat(){
        System.out.println("eating……");
    }
    public void eat(String food){
        System.out.println("eating……"+food);
    }
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
