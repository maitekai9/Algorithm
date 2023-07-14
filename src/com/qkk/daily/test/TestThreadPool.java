package com.qkk.daily.test;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestThreadPool.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月05日 21:42:36
 */
public class TestThreadPool {
    public static void main(String[] args) {
//        ThreadPoolExecutor cur = new ThreadPoolExecutor(3,
//                6, 100, TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(100), (r) -> {
//            Thread t = new Thread(r);
//            t.setName("ha" + Thread.currentThread().getName());
//            return t;
//        }, new ThreadPoolExecutor.CallerRunsPolicy());
//        cur.execute(() -> System.out.println("执行"));
//        System.out.println("hei");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
    }
}
