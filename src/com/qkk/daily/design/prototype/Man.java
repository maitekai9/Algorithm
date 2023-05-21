package com.qkk.daily.design.prototype;

import java.util.Map;

/**
 * @ClassName Man.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月29日 21:54:48
 */
public class Man implements Cloneable {
    String name;
    int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Man clone() throws CloneNotSupportedException {
        return (Man) super.clone();
    }
}
