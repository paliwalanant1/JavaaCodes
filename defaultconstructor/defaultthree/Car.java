package constructor.defaultconstructor.defaultthree;

public class Car {
    public String model;
    public int price;

    public Car(){
        model = "Dezire";
        price = 620000;
    }
    public void display(){
        System.out.println("Car Model: " + model + ", Price: " + price);
    }
}
