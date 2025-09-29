package object.cloneobject.shallowcopy.clonefive;

public class Car implements Cloneable {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void info() {
        System.out.println("Car: " + model + ", Year: " + year);
    }
}