package org.example.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构角色
 */
public class Home {
    private List<Animal> nodeList = new ArrayList<>();

    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}

