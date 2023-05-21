package com.qkk.daily.design.builder;

/**
 * @ClassName TestBulider.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月29日 21:44:29
 */
public class TestBuilder {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        builder.addName("tom").addAge(12);
        System.out.println(builder.build());
    }
}
