package com.practiceclasses.nestedclass.practiceten;
import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Category: ");
        String category1 = sc.nextLine();
        System.out.print("Items: ");
        int items1 = sc.nextInt();

        sc.nextLine();
        System.out.print("Category: ");
        String category2 = sc.nextLine();
        System.out.print("Items: ");
        int items2 = sc.nextInt();

        ResturantMenu outer = new ResturantMenu();
        ResturantMenu.Category inner1 = outer.new Category(category1, items1);
        inner1.displayInfo();

        ResturantMenu.Category inner2 = outer.new Category(category2, items2);
        inner2.displayInfo();

        sc.close();
    }
}
