package Abstraction;
abstract class Name{
    abstract void name();
}
class NameShow extends Name{
    public void name(){
        System.out.println("Anant Paliwal");
    }
}
public class Abs4 {
    public static void main(String[] args) {
        NameShow obj = new NameShow();
        obj.name();
    }
}
