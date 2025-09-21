package classes.ConcreteClass.practiceeight;
import java.util.Scanner;
public class ShowSquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int side = sc.nextInt();

        SquarePerimeter obj = new SquarePerimeter();
        System.out.println("Perimeter of Square: " + obj.perimeter(side));
    }
}
