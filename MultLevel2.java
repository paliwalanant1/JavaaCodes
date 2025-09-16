package Inheritance;
class First{
    public void display(){
        System.out.println("Hey Brother");
    }
}
class Second extends First{
    public void disp(){
        System.out.println("Empty");
    }
}
class Third extends Second{
    public void dis(){
        System.out.println("Empty");
    }
}
public class MultLevel2 {
    public static void main(String[] args) {
        Third obj = new Third();
        obj.display();
    }
}
