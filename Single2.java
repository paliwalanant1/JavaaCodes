package Inheritance;
class AA{
    public int a = 10;
}
class BB extends AA{
    public void display(){
        System.out.println("A= " + a);
    }
}
public class Single2 {
    public static void main(String[] args) {
        BB obj = new BB();
        obj.display();
    }
}
