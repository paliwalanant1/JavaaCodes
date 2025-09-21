package classes.ConcreteClass.practiceten;
import java.util.Scanner;
public class ShowRectanglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Width: ");
        int width = sc.nextInt();

        RectanglePerimeter obj = new RectanglePerimeter();
        obj.display();
        System.out.println(obj.perimeter(length, width));
    }
}
