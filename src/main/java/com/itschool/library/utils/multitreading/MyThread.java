package com.itschool.library.utils.multitreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("My thread is runing!");
    }

    public static void main(String[] args) {
        MyThread myThread= new MyThread();
        myThread.start();
    }
}
