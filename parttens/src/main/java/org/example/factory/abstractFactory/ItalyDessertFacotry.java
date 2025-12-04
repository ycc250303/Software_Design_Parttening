package org.example.factory.abstractFactory;

public class ItalyDessertFacotry implements DessertFactory{
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new MatchMousse();
    }
}
