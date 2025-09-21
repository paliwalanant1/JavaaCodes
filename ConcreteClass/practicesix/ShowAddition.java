package classes.ConcreteClass.practicesix;
import java.util.Scanner;
public class ShowAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        Addition obj = new Addition(a, b);
        obj.displayAddition();
    }
}
