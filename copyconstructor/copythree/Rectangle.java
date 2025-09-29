package constructor.copyconstructor.copythree;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }
    public double area() {
        return width * height;
    }
}
