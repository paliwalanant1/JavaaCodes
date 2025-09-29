package object.newobject.newtwelve;

public class Laptop {
    private String model;
    private double price;

    public Laptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public void details() {
        System.out.println("Laptop Model: " + model + ", Price: " + price);
    }
}
