package object.newobject.newfourteen;

public class Chair {
    private String material;
    private int legs;

    public Chair(String material, int legs) {
        this.material = material;
        this.legs = legs;
    }

    public void info() {
        System.out.println("Chair Material: " + material + ", Legs: " + legs);
    }
}
