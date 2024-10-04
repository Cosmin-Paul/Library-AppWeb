package com.itschool.library.utils.exam_recap;

public class Vehicle {

    public void move() {
        System.out.println("This vehiche is moving!");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}

class TestClass {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.move();
        bike.move();
    }
}