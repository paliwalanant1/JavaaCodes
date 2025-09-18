package com.practicefive;

public class Bank {
    public double amount;

    public Bank(double amount){
        this.amount = amount;
    }
    public void withdraw(double withdrawalAmount){
        amount -= withdrawalAmount;
        System.out.println((amount >= 0) ? "Withdraw Successful" : "Insufficient Balance");
    }
    public void diposit(double dipositAmount){
        double oldAmount = amount;
        amount += dipositAmount;
        System.out.println((amount > oldAmount)? "Deposit Successful" : "Amount not deposit");
        System.out.println("Final Balance: " + amount);
    }
}
