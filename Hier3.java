package Inheritance;
class Animal {
    public void voice() {
        System.out.println("All animals have different voices");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}
public class Hier3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.voice();
        d.bark();

        Cat c = new Cat();
        c.voice();
        c.meow();
    }
}