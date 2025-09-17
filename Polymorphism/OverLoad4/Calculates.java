package Polymorphism.OverLoad4;

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