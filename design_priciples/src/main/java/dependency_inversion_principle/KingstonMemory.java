package dependency_inversion_principle;

public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("Kingston save");
    }
}
