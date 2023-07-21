package processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String DeviceName) {
        super(DeviceName);
//        System.out.println(DeviceName.toString());
    }

    public void AssemblyDevice() {
        System.out.println("assembled smartphone");
    }

    public void TestingDevice() {
        System.out.println("tested smartphone");
    }

    public void PackagingDevice() {
        System.out.println("packaged smartphone");
    }

    public void StoringDevice() {
        System.out.println("stored smartphone");
    }


}
