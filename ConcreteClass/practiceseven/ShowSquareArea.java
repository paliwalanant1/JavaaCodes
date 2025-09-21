package classes.ConcreteClass.practiceseven;
import java.util.Scanner;
public class ShowSquareArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int side = sc.nextInt();

        SquareArea obj = new SquareArea();
        System.out.println("Area of Square: " + obj.area(side));
    }
}
