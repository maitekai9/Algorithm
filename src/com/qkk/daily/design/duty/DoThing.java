package com.qkk.daily.design.duty;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @ClassName DoThing.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年05月09日 22:20:49
 */
public abstract class DoThing {
    DoThing next;
    public void setNext(DoThing doThing) {
        this.next = doThing;
    }

    public void doThing() {
        if (next != null) {
            doNext();
        }
    }

    public void doNext() {
        next.doThing();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextInt());
        }
    }
}
