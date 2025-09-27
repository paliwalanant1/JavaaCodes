package com.practiceclasses.nestedclass.practicethree;
import java.util.Scanner;
public class DeliveryService {
    public void placeOrder(){
        class DeliveryBoy{
            public String name;
            public int minutes;

            public void deliveryDetail(){  //String name, int minutes
                System.out.println("Order Placed");
                System.out.println("Delivery Boy: " + name);
                System.out.println("Estimated Time: " + minutes + " mins");

            }
        }
        Scanner sc = new Scanner(System.in);

        DeliveryBoy obj2 = new DeliveryBoy();
        System.out.print("Delivery Boy Name: ");
        obj2.name = sc.nextLine();
        System.out.print("Estimated Time: ");
        obj2.minutes = sc.nextInt();

        obj2.deliveryDetail();

        sc.close();
    }
}
