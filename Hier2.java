package Inheritance;
class Vehicle {
    public void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}
class Car extends Vehicle {
    public void car() {
        System.out.println("Car runs on petrol and diesel");
    }
}
class Bike extends Vehicle {
    public void bike() {
        System.out.println("Bike runs on petrol only");
    }
}
public class Hier2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.fuel();
        c.car();

        Bike b = new Bike();
        b.fuel();
        b.bike();
    }
}