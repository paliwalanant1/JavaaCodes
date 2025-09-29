package constructor.parameterizeconstructor.dynamicvalues.parameterizefive;
import java.util.Scanner;

public class ShoeCarDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Model: ");
        String m = sc.nextLine();
        System.out.print("Enter Year: ");
        int y = sc.nextInt();
        CarDetail c = new CarDetail(m, y);
        c.display();
    }
}
