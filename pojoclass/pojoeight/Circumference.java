package classes.pojoclass.pojoeight;

public class Circumference {
    private double radius;

    public Circumference(int radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI* radius;
    }
}
