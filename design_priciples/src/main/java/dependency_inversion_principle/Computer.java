package dependency_inversion_principle;

public class Computer {
    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void run(){
        System.out.println("run");
        String data = hardDisk.get();
        System.out.println(data);
        cpu.run();
        memory.save();
    }
}
