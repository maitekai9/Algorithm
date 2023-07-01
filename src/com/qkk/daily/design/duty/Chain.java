package com.qkk.daily.design.duty;

/**
 * @ClassName Chain.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:48:54
 */
public abstract class Chain {
    protected Chain next;
    public void setNext(Chain next) {
        this.next = next;
    }
    public abstract boolean handle();
}
