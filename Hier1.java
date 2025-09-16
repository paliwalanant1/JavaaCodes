package Inheritance;
class Shape {
    public void draw() {
        System.out.println("Drawing shapes");
    }
}
class Circle extends Shape {
    public void drawCircle() {
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape {
    public void drawSquare() {
        System.out.println("Drawing Square");
    }
}
public class Hier1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.drawCircle();

        Square s = new Square();
        s.draw();
        s.drawSquare();
    }
}