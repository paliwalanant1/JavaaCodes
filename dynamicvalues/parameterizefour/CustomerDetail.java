package constructor.parameterizeconstructor.dynamicvalues.parameterizefour;
import java.util.Scanner;

public class CustomerDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Balance: ");
        double b = sc.nextDouble();
        BankCustomer bc = new BankCustomer(n, b);
        bc.display();
    }

}
