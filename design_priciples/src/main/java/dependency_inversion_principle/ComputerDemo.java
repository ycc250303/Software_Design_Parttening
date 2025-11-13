package dependency_inversion_principle;

public class ComputerDemo {
    public static void main(String[] args) {
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        Computer c = new Computer();
        c.setCpu(cpu);
        c.setMemory(memory);
        c.setHardDisk(hardDisk);

        c.run();
    }

}
