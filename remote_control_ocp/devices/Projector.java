package devices;

public class Projector implements Device {
    
    public void turnOn() {
        pullDownProjectorScreen();
        System.out.println("Projector is on");
    }

    public void turnOff() {
        System.out.println("Projector is off");
        pullUpProjectorScreen();
    }

    public void pullDownProjectorScreen() {
        System.out.println("Projector screen is down");
    }

    public void pullUpProjectorScreen() {
        System.out.println("Projector screen is up");
    }

    public String toString() {
        return "Projector";
    }


}
