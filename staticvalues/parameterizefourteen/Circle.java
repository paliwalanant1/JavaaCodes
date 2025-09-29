package constructor.parameterizeconstructor.staticvalues.parameterizefourteen;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void area() {
        System.out.println("Area: " + Math.PI * radius * radius);
    }
}
