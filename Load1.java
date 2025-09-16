package Polymorphism;

class Greeting {
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
public class Load1 {
    public static void main(String[] args) {
        Greeting g = new Greeting();
        g.sayHello();
        g.sayHello("Anant");
    }
}