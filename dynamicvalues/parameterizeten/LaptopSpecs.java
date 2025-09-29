package constructor.parameterizeconstructor.dynamicvalues.parameterizeten;

public class LaptopSpecs {
    private String brand;
    private int ram;

    public LaptopSpecs(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public void display() {
        System.out.println("Laptop: " + brand + ", RAM: " + ram + "GB");
    }

}
