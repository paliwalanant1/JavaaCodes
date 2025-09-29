package constructor.parameterizeconstructor.staticvalues.parameterizethree;

public class Car {
    public String model;
    public int price;

    public Car(String model, int price){
        this.model = model;
        this.price = price;
    }
    public void display(){
        System.out.println("Car Model: " + model + ", Price: " + price);
    }
}
