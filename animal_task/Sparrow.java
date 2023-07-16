public class Sparrow extends Bird implements Flyable{
    public Sparrow(String species, int age, String gender, int weightInkg) {
        super(species, age, gender, weightInkg);

    }
    
    public void fly(){
        System.out.println("Sparrow flying high....");

    }


}
