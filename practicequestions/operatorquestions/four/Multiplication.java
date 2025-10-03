package practicequestions.operatorquestions.four;
import java.util.Scanner;

public class Multiplication {
    public int a;
    public int b;
    public int c = 0;

    public void multiply(){
        for(int i = 1; b >= i; i++){
            c += a;
        }
        System.out.println("Multiplication is: " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Multiplication obj = new Multiplication();
        System.out.print("A: ");
        obj.a = sc.nextInt();
        System.out.print("B: ");
        obj.b = sc.nextInt();
        obj.multiply();
        }
}
