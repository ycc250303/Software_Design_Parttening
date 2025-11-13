package dependency_inversion_principle;

public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("Intel run");
    }
}
