package org.example.visitor;

/**
 * 抽象元素角色
 */
public interface Animal {
    // 接受访问者访问
    void accept(Person person);
}

