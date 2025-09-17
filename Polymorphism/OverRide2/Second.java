package Polymorphism.OverRide2;

public class Second extends First{
    @Override
    public void original() {
        System.out.println("After Override");
        super.original();
    }
}