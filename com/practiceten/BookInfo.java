package com.practiceten;
import java.util.Scanner;
public class BookInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("Price: ");
        int price = sc.nextInt();

        Book obj = new Book(title, author, price);
        obj.displayBookingInfo();
    }
}
