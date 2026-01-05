package org.example.mediator;

public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constact(String message) {
        mediator.constact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租房者" + name + "收到信息：" + message);
    }
}
