package Inheritance.Singlee1;

public class A{
    public void name(){
        System.out.println("Anant");
    }
}
public class B extends A{
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
