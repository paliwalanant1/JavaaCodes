package com.practiceclasses.nestedclass.practiceone;
import java.util.Scanner;
public class Billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item: ");
        String item1 = sc.nextLine();
        System.out.print("Quantity: ");
        int quantity1 = sc.nextInt();
        System.out.print("Price: ");
        int price1 = sc.nextInt();
        sc.nextLine();

        Cart.Item inner1 = new Cart.Item(item1, quantity1, price1);

        System.out.print("Item: ");
        String item2 = sc.nextLine();
        System.out.print("Quantity: ");
        int quantity2 = sc.nextInt();
        System.out.print("Price: ");
        int price2 = sc.nextInt();

        Cart.Item inner2 = new Cart.Item(item2, quantity2, price2);
        inner1.itemDetail();
        inner2.itemDetail();

        System.out.println("Total Price: " + (inner1.itemTotal() + inner2.itemTotal()));

        sc.close();
    }
}
