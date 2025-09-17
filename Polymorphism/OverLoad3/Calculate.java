package Polymorphism.OverLoad3;

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