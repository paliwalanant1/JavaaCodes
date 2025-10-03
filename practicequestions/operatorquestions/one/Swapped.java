package practicequestions.operatorquestions.one;
import java.util.Scanner;

public class Swapped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Swapping obj = new Swapping();
        System.out.print("A: ");
        obj.a = sc.nextInt();
        System.out.print("B: ");
        obj.b = sc.nextInt();
        obj.swap();
    }
}
