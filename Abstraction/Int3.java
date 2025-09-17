package Abstraction;
interface First{
    void first();
    void second();
    void third();
}
abstract class Second implements First{
    public void first(){
        System.out.println("method first");
    }
    public void second(){
        System.out.println("method second");
    }
}
class Third extends Second{
    public void third(){
        System.out.println("method third");
    }
}
public class Int3 {
    public static void main(String[] args) {
        Third obj = new Third();
        obj.first();
        obj.second();
        obj.third();
    }
}