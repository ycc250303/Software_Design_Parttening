package org.example.memento;

/**
 * 备忘录管理者角色类
 */
public class RoleStateCaretaker {
    // 备忘录对象
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}

