package Inheritance.Singlee3;
public class A1{
    public int a = 10;
}
public class B1 extends A1{
    public int b = 10;
    public void display(){
        System.out.println("A + B = " + (a+b));
    }
}

public class Single3 {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.display();
    }
}
