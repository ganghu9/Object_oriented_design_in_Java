public class Vehicle {

//    Engine racingEngine = new LargeEngine(600);
    Engine myEngine;
    Tire myTire;
    WindShield myWindShield;
    Roof myRoof;



    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }



    public void crankIgnition(){
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
