package org.example.decorator;

public class FriedNoodle extends FastFood{
    public FriedNoodle(){
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }


}
