package org.example.responsibility;

public class Client {
    public static void main(String[] args) {
        LeaveRequest leave = new LeaveRequest("小菜", 2, "我要请假");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leave);
    }
}
