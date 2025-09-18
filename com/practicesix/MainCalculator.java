package com.practicesix;
import java.util.Scanner;
public class MainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator obj = new Calculator();
        System.out.print("A: ");
        obj.a = sc.nextInt();
        System.out.print("B: ");
        obj.b = sc.nextInt();
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}
