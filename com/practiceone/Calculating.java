package com.practiceone;
import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Width: ");
        int width = sc.nextInt();
        Rectangle obj = new Rectangle(length, width);
        obj.area();
    }
}
