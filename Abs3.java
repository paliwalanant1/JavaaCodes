package Abstraction;

abstract class AA{
    abstract void show();
    abstract void shows();
}
class BB extends AA{
    public void show(){
        System.out.println("First method of abstract class");
    }
    public void shows(){
        System.out.println("Second method of abstract class");
    }
}
public class Abs3 {
    public static void main(String[] args) {
        AA obj = new BB();
        obj.show();

    }
}
