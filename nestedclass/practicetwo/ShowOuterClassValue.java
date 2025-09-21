package classes.nestedclass.practicetwo;
import java.util.Scanner;
public class ShowOuterClassValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OuterClassValue outer = new OuterClassValue();
        OuterClassValue.Inner inner = outer.new Inner();
        System.out.print("Name: ");
        outer.name = sc.nextLine();
        inner.display();
    }
}
