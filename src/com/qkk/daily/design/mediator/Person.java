package com.qkk.daily.design.mediator;

/**
 * @ClassName Person.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年12月10日 08:00:53
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;
    protected String message;
    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void contact() {
        mediator.contact(this);
    }

}
