package Polymorphism;

class Calculate {
    public void add(int x) {
        System.out.println("int A: " + x);
    }
    public void add(int x, int y) {
        System.out.println("Add: " + (x + y));
    }
    public void add(int x, int y, int z) {
        System.out.println("Add: " + (x + y + z));
    }
}

public class Load3 {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.add(100);
        obj.add(20, 10);
        obj.add(30, 40, 50);
    }
}