package org.example.visitor;

/**
 * 具体元素角色：猫
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("喵喵喵...");
    }
}

