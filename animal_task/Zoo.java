public class Zoo {

    public static void main(String[] args){
        // Animals animal01 = new Animals("Tiger", 10, "male", 100);
        // Animals animal02 = new Animals("Peacock", 15, "female", 80);
        // Animals animal03 = new Animals("Zebra", 8, "male", 100);
        // Fish fish01 = new Fish("Shark", 3, "male", 50);
        // Bird bird01 = new Bird("Eagle", 10, "male", 20);


        // animal01.speak();
        // animal02.speak();
        // animal03.speak();

        // System.out.println("=====================================");

        // fish01.speak();
        // fish01.swim();
        // fish01.move();

        // System.out.println("=====================================");

        // bird01.speak();
        // bird01.eat();
        // // bird01.fly();

        // System.out.println("=====================================");

        // Chicken chick01 = new Chicken("Chicken", 10, "female", 10);
        // chick01.speak();
        // chick01.fly();


        Sparrow sparrow01 = new Sparrow("Sparrow", 10, "female", 10);
        sparrow01.move();



        Animals sparrow02 = new Sparrow("sparrow02", 8, "female", 5);

        Animals fish02 = new Fish("Cod", 12, "male", 10);

        Animals chick02 = new Chicken(null, 0, null, 0);

        moveAnimal(sparrow02);
        moveAnimal(fish02);
        moveAnimal(chick02);


        
    }


    public static void moveAnimal(Animals animal){
        animal.move();

    }
    
}
