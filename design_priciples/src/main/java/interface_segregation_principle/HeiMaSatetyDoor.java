package interface_segregation_principle;

public class HeiMaSatetyDoor implements Waterproof,AntiTheft,Fireproof{

    @Override
    public void antitheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
