package Polymorphism;

class First{
    public void original(){
        System.out.println("Before Override");
    }
}
class Second extends First{
    @Override
    public void original() {
        System.out.println("After Override");
        super.original();
    }
}
public class Ride2 {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.original();
    }
}