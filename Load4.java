package Polymorphism;

class Calculates {
    public void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }
    public void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    public void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
public class Load4 {
    public static void main(String[] args) {
        Calculates obj = new Calculates();
        obj.area(5);
        obj.area(10, 20);
        obj.area(7.0);
    }
}