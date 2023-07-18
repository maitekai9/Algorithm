package com.qkk.daily.test;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName CallableTest.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月12日 20:24:49
 */
public class CallableTest {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = () -> 5;
        FutureTask<Integer> future = new FutureTask<>(callable);
        new Thread(future).start();
        System.out.println(future.get());
    }
}
