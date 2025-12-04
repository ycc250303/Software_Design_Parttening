package org.example.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new MobikeBuilder());

        Bike bike = director.construct();
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

        Phone phone = new Phone.Builder()
                .setCpu("Intel i7")
                .setScreen("13.3英寸")
                .setMainboard("华硕主板")
                .setMemory("16G")
                .build();

        System.out.println(phone.toString());
    }
}
