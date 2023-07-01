package com.qkk.daily.design.single;

/**
 * @ClassName SingleMan1.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:30:28
 */
public class SingleMan1 {
    private SingleMan1() {}
    public static SingleMan1 getInstance() {
        return InterSingle.INSTANCE;
    }
    static class InterSingle {
        private static final SingleMan1 INSTANCE = new SingleMan1();
    }
}
