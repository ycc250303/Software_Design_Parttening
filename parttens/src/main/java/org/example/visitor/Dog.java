package org.example.visitor;

/**
 * 具体元素角色：狗
 */
public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("汪汪汪...");
    }
}

