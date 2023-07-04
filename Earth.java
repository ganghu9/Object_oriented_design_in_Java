public class Earth {

    public static void main(String[] args){
        
        // 
        // Human tom;

        // Create a new Human object
        // tom = new Human();

        // tom.age = 5;
        // tom.eyeColor = "brown";
        // tom.heightInCms = 120;
        // tom.name = "Tom";

        // tom.speak();


        // System.out.println("=====================================");


        // Human joe = new Human();

        // joe.age = 36;
        // joe.eyeColor = "green";
        // joe.heightInCms = 190;
        // joe.name = "Joe joe";

        // joe.speak();

        Human human1 = new Human("Tom", 25, 170, "blue");
        Human human2 = new Human("Joe", 28, 180, "green");
        Human human3 = new Human("Sam", 30, 190, "brown");

        human1.speak();
        human2.speak();
        human3.speak();

    }
    
}
