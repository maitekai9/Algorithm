package com.qkk.daily.test;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName BinaryTest.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月12日 11:47:17
 */
public class BinaryTest {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(31));
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        threadLocal.set(1);
        threadLocal.get();

        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        reentrantReadWriteLock.writeLock().lock();
        reentrantReadWriteLock.writeLock().unlock();

    }
}
