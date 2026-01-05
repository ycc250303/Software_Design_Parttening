package org.example.command;

import java.util.Map;
import java.util.Set;

public class OrderCommand implements Command{

    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    public void execute() {
        System.out.println(order.getDiningTable()+"桌的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        Set<String>foodKeys = foodDir.keySet();
        for(String foodName:foodKeys){
            receiver.makeFood(foodName,foodDir.get(foodName));
        }
    }
}
