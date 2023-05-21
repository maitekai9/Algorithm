package com.qkk.daily.design.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HouseMediator.java
 * @Author Maitekai
 * @Version 1.0.0
 * @Description
 * @CreateTime 2022年12月10日 08:07:11
 */
public class HouseMediator implements Mediator{
    private final List<Person> personList = new ArrayList<>();

    @Override
    public void contact(Person person) {
        if (person instanceof HouseOwner) {
            for (Person person1: personList) {
                if (person1 instanceof HouseUser) {
                    person1.setMessage(person.getMessage());
                }
            }
        } else if (person instanceof HouseUser) {
            for (Person person1: personList) {
                if (person1 instanceof HouseOwner) {
                    person1.setMessage(person.getMessage());
                }
            }
        }
    }


    @Override
    public Mediator add(Person person) {
        this.personList.add(person);
        return this;
    }

}
