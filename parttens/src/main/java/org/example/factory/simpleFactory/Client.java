package org.example.factory.simpleFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
        coffee = coffeeStore.orderCoffee("latte");
        System.out.println(coffee.getName());
    }
}
