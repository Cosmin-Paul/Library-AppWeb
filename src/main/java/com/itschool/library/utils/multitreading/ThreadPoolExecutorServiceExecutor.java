package com.itschool.library.utils.multitreading;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorServiceExecutor {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2, // pool size
                4, // max pool size
                60, //keep alive time
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>()
        );

        Runnable task1 = () -> System.out.println("Task 1 in a custom thread pool");
        Runnable task2 = () -> System.out.println("Task 2 in a custom thread pool");

        threadPoolExecutor.execute(task1);
        threadPoolExecutor.execute(task2);
        threadPoolExecutor.shutdown();
    }
}
