package object.newobject.newsixteen;

public class Bicycle {
    private String brand;
    private int gears;

    public Bicycle(String brand, int gears) {
        this.brand = brand;
        this.gears = gears;
    }

    public void ride() {
        System.out.println("Bicycle Brand: " + brand + ", Gears: " + gears);
    }
}
