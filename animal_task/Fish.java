public class Fish extends Animals{

    public Fish(String species, int age, String gender, int weightInkg) {
        super(species, age, gender, weightInkg);

    }

    public void swim(){
        System.out.println("swimming....");

    }

    public void move(){
        System.out.println("Fish is swimming....");

    }


    
}
