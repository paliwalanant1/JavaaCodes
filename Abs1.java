package Abstraction;
abstract class A{
    abstract void show();
}
class B extends A{
    public void show(){
        System.out.println("I'm the extended abstract method from parent abstract class");
    }
}
public class Abs1 {
    public static void main(String[] args) {
        A obj =  new B();
        obj.show();
    }
}