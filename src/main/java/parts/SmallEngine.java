package parts;

public class SmallEngine implements Engine {

    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    public void startEngine() {
        System.out.println("Started small " + horsePower + "hp engine");
    }


}
