package practicequestions.operatorquestions.three;
import java.util.Scanner;

public class SameSign {
    public int a;
    public int b;

    public void check(){
        if((a ^ b) > 0)
        {                                              // ^ returns "true" if both argument are different
            System.out.println("Both have same Sign");
        }else{
            System.out.println("Different Sign");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SameSign obj = new SameSign();
        System.out.print("A: ");
        obj.a = sc.nextInt();
        System.out.print("B: ");
        obj.b = sc.nextInt();
        obj.check();
    }
}

