package com.practicefive;
import java.util.Scanner;
public class BankStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Withdrawal Amount: ");
        double withdrawalAmount = sc.nextDouble();
        System.out.print("Deposit Amount: ");
        double dipositAmount = sc.nextDouble();

        Bank obj = new Bank(amount);
        obj.withdraw(withdrawalAmount);
        obj.diposit(dipositAmount);
    }
}
