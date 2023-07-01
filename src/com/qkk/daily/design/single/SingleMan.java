package com.qkk.daily.design.single;

/**
 * @ClassName SingleMan.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2023年07月01日 22:27:17
 */
public class SingleMan {
    private static volatile SingleMan instance;

    private SingleMan() {}
    public static SingleMan getInstance() {
        if (instance == null) {
            synchronized (SingleMan.class) {
                if (instance == null) {
                    instance = new SingleMan();
                }
            }
        }
        return instance;
    }
}
