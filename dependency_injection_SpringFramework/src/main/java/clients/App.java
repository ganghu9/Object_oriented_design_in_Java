package clients;

import parts.SmallEngine;
import vehicles.Vehicle;

public class App {
    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle(new SmallEngine(100));
//        vehicles.Vehicle raceCar = new vehicles.Vehicle(new parts.LargeEngine(600));
        raceCar.crankIgnition();
    }




}
