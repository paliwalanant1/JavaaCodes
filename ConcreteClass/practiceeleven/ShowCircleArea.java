package classes.ConcreteClass.practiceeleven;
import java.util.Scanner;
public class ShowCircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        int radius = sc.nextInt();

        CircleArea obj = new CircleArea(radius);
        obj.display();
    }
}
