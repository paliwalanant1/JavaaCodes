package com.practiceeighteen;
import java.util.Scanner;
public class MainProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ProductId: ");
        int productId = sc.nextInt();
        sc.nextLine();
        System.out.print("ProductName: ");
        String productName = sc.nextLine();
        System.out.print("Price: ");
        int price = sc.nextInt();

        Product obj = new Product(productId, productName, price);
        obj.showDetail();
    }
}
