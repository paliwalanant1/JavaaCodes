package com.practiceclasses.nestedclass.practicetwo;
import java.util.Scanner;
public class AccountTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount obj1 = new BankAccount();
        BankAccount.Transaction obj2 = obj1.new Transaction();

        System.out.print("Deposit: ");
        obj2.deposit = sc.nextDouble();
        System.out.print("Withdraw: ");
        obj2.withdraw = sc.nextDouble();

        obj2.depositAmount();
        obj2.withdrawAmount();
        obj2.balance();

        sc.close();
    }
}
