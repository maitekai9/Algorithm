package com.qkk.daily.design.duty;

/**
 * @ClassName ChainBuilder.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:54:09
 */
public class ChainBuilder {
    private Chain head;
    private Chain tail;
    public void append(Chain chain) {
        if (head == null) {
            head = chain;
        } else {
            tail.setNext(chain);
        }
        tail = chain;
    }

    public boolean handle() {
        return head.handle();
    }
}
