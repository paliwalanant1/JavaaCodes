package constructor.copyconstructor.copytwo;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(Car other) {
        this.model = other.model;
        this.year = other.year;
    }

    public String getModel() {
        return model;

    }
    public int getYear() {
        return year;
    }
}
