package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vehicles.Vehicle;

public class App {
    public static void main(String[] args) {
//        Vehicle raceCar = new Vehicle(new SmallEngine(100));
////        vehicles.Vehicle raceCar = new vehicles.Vehicle(new parts.LargeEngine(600));
//        raceCar.crankIgnition();
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle aCar = (Vehicle) context.getBean("mrBeansCar");
        aCar.crankIgnition();
    }




}
