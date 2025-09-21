package classes.ConcreteClass.practicenine;
import java.util.Scanner;
public class ShowRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Width: ");
        int width = sc.nextInt();

        RectangleArea obj = new RectangleArea(length, width);
        obj.display();
    }
}
