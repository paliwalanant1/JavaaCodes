package com.practicetweentyfive;
import java.util.Scanner;
public class OrderDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Order Id: ");
        int id = sc.nextInt();
        System.out.print("Amount: ");
        int amount = sc.nextInt();
        sc.nextLine();
        System.out.print("Status: ");
        String status = sc.nextLine();

        Order obj = new Order(id, amount, status);
        obj.displayOrder();
    }
}
