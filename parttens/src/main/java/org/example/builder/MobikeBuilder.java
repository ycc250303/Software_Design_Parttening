package org.example.builder;

public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("Mobike frame");
    }
    @Override
    public void buildSeat() {
        bike.setSeat("Mobike seat");
    }
    @Override
    public Bike createBike() {
//        buildFrame();
//        buildSeat();
        return bike;
    }
}
