package object.newobject.neweight;

public class Pen {
    private String color;
    private double price;

    public Pen(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public void write() {
        System.out.println("Pen Color: " + color + ", Price: " + price);
    }

    public static void main(String[] args) {
        Pen p1 = new Pen("Blue", 10.5);
        p1.write();
    }
}
