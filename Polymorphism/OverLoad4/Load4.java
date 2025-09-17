package Polymorphism.OverLoad4;

public class Load4 {
    public static void main(String[] args) {
        Calculates obj = new Calculates();
        obj.area(5);
        obj.area(10, 20);
        obj.area(7.0);
    }
}