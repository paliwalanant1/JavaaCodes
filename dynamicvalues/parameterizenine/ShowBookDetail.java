package constructor.parameterizeconstructor.dynamicvalues.parameterizenine;
import java.util.Scanner;

public class ShowBookDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String t = sc.nextLine();
        System.out.print("Enter Author: ");
        String a = sc.nextLine();
        BookDetails b = new BookDetails(t, a);
        b.show();
    }
}
