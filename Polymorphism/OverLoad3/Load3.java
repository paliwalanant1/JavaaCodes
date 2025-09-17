package Polymorphism.OverLoad3;

public class Load3 {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.add(100);
        obj.add(20, 10);
        obj.add(30, 40, 50);
    }
}