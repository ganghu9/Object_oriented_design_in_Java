package clients;

import processes.GeneralManufacturingProcess;
import processes.LaptopManufacturingProcess;
import processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer1 = new SmartphoneManufacturingProcess("Iphone");
        GeneralManufacturingProcess manufacturer2 = new LaptopManufacturingProcess("MacbookPro");
        manufacturer1.launchProcess();
        manufacturer2.launchProcess();
    }




}
