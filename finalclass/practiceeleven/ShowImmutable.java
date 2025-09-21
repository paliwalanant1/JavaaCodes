package classes.finalclass.practiceeleven;
import java.util.Scanner;
public class ShowImmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: " );
        String name = sc.nextLine();

        Immutable obj = new Immutable(age, name);
        System.out.println("Name: " + obj.getName() + "A, ge: " + obj.getAge());
    }
}
