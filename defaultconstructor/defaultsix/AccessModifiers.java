package constructor.defaultconstructor.defaultsix;

public class AccessModifiers {
    public int a;
    private int b;
    protected int c;

    public AccessModifiers() {
        this.a = 10;
        this.b = 20;
        this.c = 30;
    }
    public void display(){
        System.out.println("A: " + a + ", B: " + b + ", C: " + c);
    }
}