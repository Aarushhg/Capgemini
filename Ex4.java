package spring;

import java.util.function.Supplier;

class Person {

    private String name;
    private int age;

    public Person() {
        System.out.println("Person object created!");
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
}

public class Ex4 {

    public static void main(String[] args) {

        Supplier<Person> personSupplier = Person::new;

        Person p = personSupplier.get();

        p.setName("John");
        p.setAge(25);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}