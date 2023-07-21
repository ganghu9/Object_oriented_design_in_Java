package user;

import devices.Projector;
import devices.SurroundSoundSystem;
import devices.TV;
import remotes.RemoteControl;

public class Person {
    public static void main(String[] args) {
        // // Create a new instance of a SurroundSoundSystem
        // devices.SurroundSoundSystem sss = new devices.SurroundSoundSystem();
        // // Create a new instance of a TV
        // devices.TV tv = new devices.TV();
        // // Create a new instance of a Projector
        // devices.Projector projector = new devices.Projector();
        // // Turn on the SurroundSoundSystem
        // sss.turnOn();
        // // Turn on the TV
        // tv.turnOn();
        // // Turn on the Projector
        // projector.turnOn();
        // // Turn off the SurroundSoundSystem
        // sss.turnOff();
        // // Turn off the TV
        // tv.turnOff();
        // // Turn off the Projector
        // projector.turnOff();
        
        SurroundSoundSystem sss = new SurroundSoundSystem();

        TV tv = new TV();

        Projector projector = new Projector();

        // control
        RemoteControl remoteControl = RemoteControl.getInstance();

        remoteControl.connectToDevice(sss);
        remoteControl.clickOn();

        remoteControl.connectToDevice(tv);
        remoteControl.clickOn();

        remoteControl.connectToDevice(projector);
        remoteControl.clickOn();

    }
}
