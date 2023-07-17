package remotes;

import devices.Device;

public class RemoteControl {

    private Device device = null;
    
    private static final RemoteControl INSTANCE = new RemoteControl();

    public static RemoteControl getInstance() {
        return INSTANCE;
    }

    public void connectToDevice(Device device) {
        this.device = device;
        System.out.println("---- Connected to: " + device + " ----");
    }

    public void clickOn() {
        device.turnOn();
    }

    public void clickOff() {
        device.turnOff();
    }
    
}
