package classes.ConcreteClass.practicefour;
import java.util.Scanner;
public class ShowName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Name obj = new Name();
        System.out.print("Name: ");
        obj.name = sc.nextLine();
        obj.display();
    }
}
