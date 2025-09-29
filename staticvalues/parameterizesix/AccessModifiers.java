package constructor.parameterizeconstructor.staticvalues.parameterizesix;

public class AccessModifiers {
    public int a;
    private int b;
    protected int c;

    public AccessModifiers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void display(){
        System.out.println("A: " + a + ", B: " + b + ", C: " + c);
    }
}
