package classes.nestedclass.practicethree;
import java.util.Scanner;
public class ShowName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        Name outer = new Name();
        Name.Inner inner = outer.new Inner(name);
        inner.display();
    }
}
