package com.practiceclasses.nestedclass.practiceeight;
import java.util.Scanner;
public class OnlineStoreBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original Price: ");
        float price = sc.nextFloat();
        System.out.print("Discount: ");
        float discount = sc.nextFloat();

        OnlineStore outer = new OnlineStore();
        OnlineStore.Discount inner = outer.new Discount(price, discount);
        System.out.println("Original Price: " + inner.getPrice());
        System.out.println("Discount: " + inner.getDiscount() + "%");
        inner.finalAmount();

        sc.close();
    }
}
