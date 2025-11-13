package dependency_inversion_principle;

public class XiJieHardDisk implements HardDisk{
    public void save(String data){
        System.out.println("XiJie save");
    }

    public String get(){
        System.out.println("XiJie get");
        return "Data";
    }
}
