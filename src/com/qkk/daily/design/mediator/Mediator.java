package com.qkk.daily.design.mediator;

/**
 * @ClassName Mediator.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年12月10日 08:00:16
 */
public interface Mediator {
    void contact(Person person);
    Mediator add(Person person);
}
