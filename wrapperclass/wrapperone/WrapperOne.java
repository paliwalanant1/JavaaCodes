package classes.wrapperclass.wrapperone;

public class WrapperOne {

    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a); //boxing kar rhe he, int to integer
        System.out.println("Wrapper Integer: " + obj);
    }
}