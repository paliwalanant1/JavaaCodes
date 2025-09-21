package classes.ConcreteClass.practicetwelve;
import java.util.Scanner;
public class ShowCircleCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        int radius = sc.nextInt();

        CircleCircumference obj = new CircleCircumference(radius);
        obj.display();
    }
}