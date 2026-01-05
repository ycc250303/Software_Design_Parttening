package org.example.mediator;

public class MediatorStructure extends Mediator{
    private HouseOwner houseOwner;
    private Tenant tenant;
    @Override
    public void constact(String message, Person person) {
        if (person instanceof Tenant) {
            houseOwner.getMessage(message);
        } else if (person instanceof HouseOwner) {
            tenant.getMessage(message);
        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
