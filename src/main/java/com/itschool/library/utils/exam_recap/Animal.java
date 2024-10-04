package com.itschool.library.utils.exam_recap;

public class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Ham Ham...");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Miau Miau...");
    }
}

class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}