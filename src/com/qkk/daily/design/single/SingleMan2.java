package com.qkk.daily.design.single;

/**
 * @ClassName SingleMan2.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:34:02
 */
public class SingleMan2 {
    private SingleMan2() {}

    public static SingleMan2 getInstance() {
        return InterSingle.INTER_SINGLE.instance;
    }
    enum InterSingle {
        INTER_SINGLE;
        private final SingleMan2 instance;
        InterSingle() {
            instance = new SingleMan2();
        }
    }
}
