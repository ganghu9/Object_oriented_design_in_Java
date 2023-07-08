public abstract class Animals {

    String species;
    int age;
    String gender;
    int weightInkg;


    public Animals(String species, int age, String gender, int weightInkg){
        super();
        this.species = species;
        this.age = age;
        this.gender = gender;
        this.weightInkg = weightInkg;

    }
    
    public void eat(){
        System.out.println("eating....");

    }


    public void sleep(){
        System.out.println("sleeping....");

    }


    public abstract void move();


    // public void fly(){
    //     System.out.println("flying....");

    // }

    // public void swim(){
    //     System.out.println("swimming....");

    // }


    public void speak(){
        System.out.println("Hello, I am a " + species);
        System.out.println("I am " + age + " years old");
        System.out.println("My gender is " + gender);
        System.out.println("My weight is " + weightInkg + " kilograms");

    }
}
