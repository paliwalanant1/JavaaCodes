package classes.ConcreteClass.practicesix;

public class Addition {
    public int a;
    public int b;

    public Addition(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void displayAddition(){
        System.out.println("Addition: " + (a + b));
    }
}