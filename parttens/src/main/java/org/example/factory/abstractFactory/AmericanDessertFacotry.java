package org.example.factory.abstractFactory;

public class AmericanDessertFacotry implements DessertFactory{
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
