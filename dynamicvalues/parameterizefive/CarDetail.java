package constructor.parameterizeconstructor.dynamicvalues.parameterizefive;

public class CarDetail {
    private String model;
    private int year;

    public CarDetail(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Car: " + model + ", Year: " + year);
    }
}
