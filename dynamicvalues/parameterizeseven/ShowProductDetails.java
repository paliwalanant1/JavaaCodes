package constructor.parameterizeconstructor.dynamicvalues.parameterizeseven;
import java.util.Scanner;

public class ShowProductDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Price: ");
        double p = sc.nextDouble();
        ProductDetails pd = new ProductDetails(n, p);
        pd.display();
    }
}
