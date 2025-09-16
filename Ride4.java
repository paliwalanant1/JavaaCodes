package Polymorphism;

class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
public class Ride4 {
    public static void main(String[] args) {
        Animal a1 = new Dog();  // Upcasting
        a1.sound();

        Animal a2 = new Cat();  // Upcasting
        a2.sound();
    }
}