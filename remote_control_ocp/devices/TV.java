package devices;

public class TV implements Device {

    public void turnOn() {
        System.out.println("TV is on");
    }

    public void turnOff() {
        System.out.println("TV is off");
    }


    public void switchToFavoriteChannel() {
        System.out.println("Favorite channel is playing");
    }

    public String toString() {
        return "Television";
    } 


}