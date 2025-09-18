package com.practicetwenty;
import java.util.Scanner;
public class MobileDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mobile obj = new Mobile();

        System.out.print("Brand: ");
        obj.brand = sc.nextLine();
        System.out.print("Price: ");
        obj.price = sc.nextInt();
        obj.showDetail();
    }
}
