package Inheritance;

class A{
    public void name(){
        System.out.println("Anant");
    }
}
class B extends A{
    public void surname(){
        System.out.println("Paliwal");
    }
}
public class Single1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.name();
        obj.surname();
    }
}
