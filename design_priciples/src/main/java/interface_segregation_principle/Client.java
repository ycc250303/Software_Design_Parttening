package interface_segregation_principle;

public class Client {
    public static void main(String[] args){
        HeiMaSatetyDoor door = new HeiMaSatetyDoor();

        door.antitheft();;
        door.waterproof();
        door.fireproof();
    }
}
