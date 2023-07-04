public class Chicken extends Bird{
    public Chicken(String species, int age, String gender, int weightInkg) {
        super(species, age, gender, weightInkg);

    }

    // overriding the method defined in Bird.java
    public void fly(){
        System.out.println("Not able to fly....");

    }
    
}
