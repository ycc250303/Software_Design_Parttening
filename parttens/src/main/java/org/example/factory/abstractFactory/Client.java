package org.example.factory.abstractFactory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFacotry factory = new ItalyDessertFacotry();
        Dessert dessert = factory.createDessert();
        dessert.show();

        AmericanDessertFacotry factory2 = new AmericanDessertFacotry();
        Dessert dessert2 = factory2.createDessert();
        dessert2.show();
    }
}
