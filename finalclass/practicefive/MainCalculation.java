package classes.finalclass.practicefive;
import java.util.Scanner;
public class MainCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();

        Calculation obj = new Calculation();
        System.out.println("Addition: " + obj.addition(a, b));
        System.out.println("Subtract: " + obj.subtract(a, b));
        System.out.println("Divide: " + obj.divide(a, b));
        System.out.println("Multiply: " + obj.multiply(a, b));
    }

}
