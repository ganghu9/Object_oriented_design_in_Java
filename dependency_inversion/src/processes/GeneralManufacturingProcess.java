package processes;

import javax.swing.event.DocumentEvent;

public abstract class GeneralManufacturingProcess {

    private String DeviceName;

    public GeneralManufacturingProcess(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    protected abstract void AssemblyDevice();

    protected abstract void TestingDevice();

    protected abstract void PackagingDevice();

    protected abstract void StoringDevice();

//    public String toString() {
//        return "[DeviceName = " + DeviceName + "]";
//    }

    //  template method
    public void launchProcess(){
        if (DeviceName != null && !DeviceName.isEmpty()){
            AssemblyDevice();
            TestingDevice();
            PackagingDevice();
            StoringDevice();


        }
        else{
            System.out.println("No DeviceName is specified");
        }
    }

}
