package object.newobject.newthree;

public class Car {
    private String brand;
    private int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void show() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2022);
        c1.show();
    }
}
