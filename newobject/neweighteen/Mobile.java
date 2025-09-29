package object.newobject.neweighteen;

public class Mobile {
    private String brand;
    private int battery;

    public Mobile(String brand, int battery) {
        this.brand = brand;
        this.battery = battery;
    }

    public void show() {
        System.out.println("Mobile Brand: " + brand + ", Battery: " + battery + "mAh");
    }
}