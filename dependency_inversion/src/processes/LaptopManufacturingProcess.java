package processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String DeviceName) {
        super(DeviceName);
//        System.out.println(DeviceName);
    }

    public void AssemblyDevice() {
        System.out.println("assembled laptop");
    }

    public void TestingDevice() {
        System.out.println("tested laptop");
    }

    public void PackagingDevice() {
        System.out.println("packaged laptop");
    }

    public void StoringDevice() {
        System.out.println("stored laptop");
    }


}
