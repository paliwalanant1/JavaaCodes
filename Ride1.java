package Polymorphism;
class Firstt{
    public void original(){
        System.out.println("Before Override");
    }
}
class Secondd extends First{
    @Override
    public void original() {
        System.out.println("After Override");
    }
}
public class Ride1 {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.original();
    }
}