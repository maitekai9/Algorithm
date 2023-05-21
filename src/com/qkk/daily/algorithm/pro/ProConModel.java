package com.qkk.daily.algorithm.pro;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ProConModel.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年03月07日 22:32:05
 */
public class ProConModel {
    private static int count = 0;
    private static boolean flag = false;

    static class Share {
        public synchronized void print(int i) {
            if (flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag = true;
            count = i;
            System.out.println("pro count:" + count);
            notify();
        }

        public synchronized void get() {
            if (!flag) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag = false;
            System.out.println("con count:" + count);
            notify();
        }
    }
    static class Producer implements Runnable {
        private Share share;

        public Producer(Share share) {
            this.share = share;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                share.print(i);
            }
        }
    }

    static class Consumer implements Runnable {
        private Share share;

        public Consumer(Share share) {
            this.share = share;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                share.get();
            }
        }
    }

    public static void main(String[] args) {
        Share share = new Share();
        new Thread(new Producer(share)).start();
        new Thread(new Consumer(share)).start();
    }
}
