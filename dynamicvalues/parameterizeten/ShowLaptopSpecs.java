package constructor.parameterizeconstructor.dynamicvalues.parameterizeten;
import java.util.Scanner;

public class ShowLaptopSpecs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Laptop Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter RAM (in GB): ");
        int ram = sc.nextInt();
        LaptopSpecs ls = new LaptopSpecs(brand, ram);
        ls.display();
    }
}
