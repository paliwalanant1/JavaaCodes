package Abstraction;

abstract class A1{
    abstract void show();
    public void shows(){
        System.out.println("Regular method in Abstract class");
    }
}
class A2 extends A1{
    public void show(){
        System.out.println("I'm the extended abstract method from parent abstract class");
    }
}
public class Abs2 {
    public static void main(String[] args) {
        A1 obj = new A2();
        obj.show();
        obj.shows();
    }
}
