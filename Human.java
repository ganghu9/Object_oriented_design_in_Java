public class Human {
    
    String name;
    int age;
    int heightInCms;
    String eyeColor;

    // Constructor method always has the same name as the class
    public Human(){

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