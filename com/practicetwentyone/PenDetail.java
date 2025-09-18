package com.practicetwentyone;
import java.util.Scanner;
public class PenDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Color: ");
        String color = sc.nextLine();
        System.out.print("Price: ");
        int price = sc.nextInt();

        Pen obj = new Pen(color, price);
        obj.displayDetails();
    }
}
