package constructor.copyconstructor.copythree;

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 6);
        Rectangle r2 = new Rectangle(r1);
        System.out.println("Area1: " + r1.area());
        System.out.println("Area2: " + r2.area());
    }

}
