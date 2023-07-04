public class Human {
    
    String name;
    int age;
    int heightInCms;
    String eyeColor;

    // Constructor method always has the same name as the class
    // public Human(){
    //     age = 5;
    //     eyeColor = "brown";
    //     heightInCms = 120;
    //     name = "Tom";

    // }

    // more flexible and general constructor 
    public Human(String name, int age, int heightInCms, String eyeColor){
        // super();
        this.name = name;
        this.age = age;
        this.heightInCms = heightInCms;
        this.eyeColor = eyeColor;

    }

    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInCms + " centimeters tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);

    }

    public void eat(){
        System.out.println("eating....");

    }

    public void walk(){
        System.out.println("walking....");

    }

    public void work(){
        System.out.println("working....");

    }

}