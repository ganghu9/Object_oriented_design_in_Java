package vehicles;

import parts.Engine;

public class Vehicle {

//    parts.Engine racingEngine = new parts.LargeEngine(600);
    private Engine myEngine;
//    Tire myTire;
//    WindShield myWindShield;
//    Roof myRoof;



    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }



    public void crankIgnition(){
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
