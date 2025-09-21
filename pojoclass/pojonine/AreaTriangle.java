package classes.pojoclass.pojonine;

public class AreaTriangle {
    private double base;
    private double height;

    public AreaTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return (base * height) * 1 / 2 ;
    }
}
