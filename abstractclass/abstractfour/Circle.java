package classes.abstractclass.abstractfour;

public class Circle extends Shape {
    public int r = 5;
    public void area() {
        System.out.println("Area: " + (Math.PI * r * r));
    }
    public void perimeter() {
        System.out.println("Perimeter: " + (2 * Math.PI * r));
    }
}