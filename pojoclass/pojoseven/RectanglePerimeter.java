package classes.pojoclass.pojoseven;

public class RectanglePerimeter {
    private double length;
    private double width;

    public RectanglePerimeter(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
