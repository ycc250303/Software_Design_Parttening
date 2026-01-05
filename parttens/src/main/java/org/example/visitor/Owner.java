package org.example.visitor;

/**
 * 具体访问者角色：主人
 */
public class Owner implements Person {
    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗...");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫...");
    }
}

