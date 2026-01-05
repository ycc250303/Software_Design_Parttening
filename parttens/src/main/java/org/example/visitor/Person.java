package org.example.visitor;

/**
 * 抽象访问者角色
 */
public interface Person {
    // 喂食狗
    void feed(Dog dog);
    // 喂食猫
    void feed(Cat cat);
}

