package Polymorphism;

class Calculator {
    public void add(int a, int b) {
        System.out.println("Add: " + (a + b));
    }
    public void add(double a, double b) {
        System.out.println("Add: " + (a + b));
    }
}
public class Load2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.add(5.5, 6.7);
    }
}