package org.example.facade;

public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.on();
        facade.off();
    }
}
