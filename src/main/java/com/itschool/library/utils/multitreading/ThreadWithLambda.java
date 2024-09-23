package com.itschool.library.utils.multitreading;

public class ThreadWithLambda {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Lambda expression thread is running"));
        thread.start();   //starting the thread

    }
}
