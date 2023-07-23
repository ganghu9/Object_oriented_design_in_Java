public class App {
    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle(new SmallEngine(100));
//        Vehicle raceCar = new Vehicle(new LargeEngine(600));
        raceCar.crankIgnition();
    }




}
