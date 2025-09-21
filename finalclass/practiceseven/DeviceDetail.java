package classes.finalclass.practiceseven;
import java.util.Scanner;
public class DeviceDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("price: ");
        int price = sc.nextInt();

        Device obj = new Device(model, price);
        System.out.println("Model: " + obj.getModel() + ", Price: " + obj.getPrice());
    }
}
