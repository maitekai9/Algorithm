package com.qkk.daily.algorithm;

import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Deque;

/**
 * @ClassName CQueue.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年02月15日 21:42:30
 */
public class CQueue {
    Deque<Integer> in;
    Deque<Integer> out;
    public CQueue() {
        in = new ArrayDeque<>();
        out = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        in.push(value);
    }

    public int deleteHead() {
        if (out.isEmpty()) {
            if (in.isEmpty()) {
                return -1;
            }
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public static void main(String[] args) {
        BitSet set = new BitSet();
        set.set(1);
        set.get(2);
    }
}
