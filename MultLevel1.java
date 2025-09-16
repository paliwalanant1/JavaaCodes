package Inheritance;
class A01{
    public void first(){
        System.out.println("Hello");
    }
}
class B01 extends A01{
    public void second(){
        System.out.println("Hii");
    }
}
class C01 extends B01{
    public void third(){
        System.out.println("Thank you");
    }
}
public class MultLevel1 {
    public static void main(String[] args) {
        C01 obj1 = new C01();
        obj1.first();
        obj1.second();
        obj1.third();
    }
}
