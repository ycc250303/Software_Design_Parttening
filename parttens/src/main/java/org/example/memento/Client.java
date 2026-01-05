package org.example.memento;

public class Client {
    public static void main(String[] args) {
        System.out.println("---------- 大战前 ----------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.displayState();

        // 保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(gameRole.saveState());

        System.out.println("---------- 大战后 ----------");
        gameRole.fight();
        gameRole.displayState();

        System.out.println("---------- 恢复进度 ----------");
        gameRole.recoverState(caretaker.getMemento());
        gameRole.displayState();
    }
}

