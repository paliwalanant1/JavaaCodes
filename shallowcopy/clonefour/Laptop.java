package object.cloneobject.shallowcopy.clonefour;

public class Laptop implements Cloneable {
    private String brand;
    private int ram;

    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void details() {
        System.out.println("Laptop: " + brand + ", RAM: " + ram + "GB");
    }
}
