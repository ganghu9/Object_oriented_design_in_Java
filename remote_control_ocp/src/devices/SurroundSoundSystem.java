package devices;

public class SurroundSoundSystem implements Device{

    public void turnOn() {
        System.out.println("SurroundSoundSystem is on");
        increaseVolume();
        switchToFavoriteCD();
    }

    public void turnOff() {
        decreaseVolume();
        System.out.println("SurroundSoundSystem is off");

    }
    
    public void increaseVolume() {
        System.out.println("Volume is increased");
    }

    public void decreaseVolume() {
        System.out.println("Volume is decreased");
    }

    public void switchToFavoriteCD() {
        System.out.println("Favorite CD is playing");
    }

    public String toString() {
        return "SurroundSoundSystem";
    }


}
