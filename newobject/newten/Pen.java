package object.newobject.newten;

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
}