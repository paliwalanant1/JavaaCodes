package Polymorphism;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class Ride3 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Square();

        s1.draw();
        s2.draw();
    }
}
