package practicequestions.operatorquestions.one;
//Swappingg without using third varaibless
public class Swapping {
    public int a;
    public int b;

    public void swap(){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping: ");
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
