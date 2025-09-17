package Encapsulation.Encp3;

public class Add {
    private int a;
    private int b;

    Add(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void getAdd()
    {
        int add = a + b;
        System.out.println(add);
    }
}