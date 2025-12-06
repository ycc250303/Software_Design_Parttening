package org.example.decorator;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedRice();
        FastFood food2 = new FriedNoodle();

        System.out.println(food.getDesc() + " " +food.cost()+"元");

        food = new Egg(food);

        System.out.println(food.getDesc() + " " +food.cost()+"元");

        food = new Bacon(food2);


        System.out.println(food.getDesc() + " " +food.cost()+"元");
    }
}
