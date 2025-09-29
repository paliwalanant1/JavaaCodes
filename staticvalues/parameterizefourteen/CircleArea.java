package constructor.parameterizeconstructor.staticvalues.parameterizefourteen;

public class CircleArea {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Radius: " + c.getRadius());
        c.area();
    }
}
