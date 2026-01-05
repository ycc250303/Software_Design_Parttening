package org.example.command;

public class Client {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面",1);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("鸡蛋面",2);

        SeniorChef receiver = new SeniorChef();

        OrderCommand command1 = new OrderCommand(receiver,order1);
        OrderCommand command2 = new OrderCommand(receiver,order2);

        Waitor waitor = new Waitor();
        waitor.setCommand(command1);
        waitor.setCommand(command2);
        waitor.orderUp();
    }
}
