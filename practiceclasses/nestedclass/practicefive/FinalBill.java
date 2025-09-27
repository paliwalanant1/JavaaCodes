package com.practiceclasses.nestedclass.practicefive;
import java.util.Scanner;
public class FinalBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Item: ");
        String itemOne = sc.nextLine();
        System.out.print("Price: ");
        int priceOne = sc.nextInt();
        sc.nextLine();
        System.out.print("Item: ");
        String itemTwo = sc.nextLine();
        System.out.print("Price: ");
        int priceTwo = sc.nextInt();

        Bill.Item inner = new Bill.Item(itemOne, priceOne, itemTwo, priceTwo);
        inner.grandTotal();

        sc.close();
    }
}
