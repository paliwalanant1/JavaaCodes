package Polymorphism.OverLoad2;

public class Calculator {
    public void add(int a, int b) {
        System.out.println("Add: " + (a + b));
    }
    public void add(double a, double b) {
        System.out.println("Add: " + (a + b));
    }
}