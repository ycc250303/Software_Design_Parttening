package org.example.facade;

// 外观类
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    public void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
