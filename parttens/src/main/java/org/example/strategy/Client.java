package org.example.strategy;

public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.show();

        salesMan.setStrategy(new StrategyB());
        salesMan.show();
    }
}
