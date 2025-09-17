package Polymorphism.OverLoad1;

public class Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}