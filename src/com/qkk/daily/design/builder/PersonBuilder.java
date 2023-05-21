package com.qkk.daily.design.builder;

/**
 * @ClassName PersonBulider.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年11月29日 21:42:09
 */
public class PersonBuilder implements Builder<Person>{
    private final Person person = new Person();
    public PersonBuilder addName(String name) {
        person.setName(name);
        return this;
    }
    public PersonBuilder addAge(Integer age) {
        person.setAge(age);
        return this;
    }
    @Override
    public Person build() {
        return person;
    }
}
