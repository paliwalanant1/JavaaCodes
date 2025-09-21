package classes.finalclass.practicethree;
import java.util.Scanner;
public class ShowCircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        int radius = sc.nextInt();

        CircleArea obj = new CircleArea();
        obj.setRadius(radius);
        obj.display();

    }
}
