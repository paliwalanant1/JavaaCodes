package Polymorphism.OverRide4;

public class Ride4 {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Upcasting
        a1.sound();

        Animal a2 = new Cat();  // Upcasting
        a2.sound();
    }
}