package org.example.proxy.staticProxy;

public class ProxyPoint implements SellTickets{
    private final TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点收取服务费");
        trainStation.sell();
    }
}
