package Encapsulation;

class Add {
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

public class Enc3 {
    public static void main(String[] args)
    {
        Add obj = new Add(2, 18);
        obj.getAdd();
    }
}
