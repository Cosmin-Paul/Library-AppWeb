package com.itschool.library.utils.exam_recap;

public class Person {

    private String name;
    private int age;

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

class testPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(27);

        System.out.println(person.getName() + " " + person.getAge());
    }
}