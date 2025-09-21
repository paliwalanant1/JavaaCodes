package classes.nestedclass.practicefour;
import java.util.Scanner;
public class ShowAddSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();

        AddSub outer = new AddSub();
        AddSub.Inner inner = outer.new Inner();
        System.out.println("Addition: " + inner.add(a, b));
        System.out.println("Subtract: " + inner.sub(a, b));
    }
}
