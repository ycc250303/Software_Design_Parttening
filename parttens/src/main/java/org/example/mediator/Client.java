package org.example.mediator;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("张三", mediator);
        Tenant tenant = new Tenant("李四", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        tenant.constact("我要租房");
        houseOwner.constact("有空房");
    }
}
