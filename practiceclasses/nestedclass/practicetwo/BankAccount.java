package com.practiceclasses.nestedclass.practicetwo;

public class BankAccount {
    public class Transaction{
        public double deposit;
        public double amount = 0;
        public double withdraw;

        public void depositAmount(){  //double deposit
            System.out.println("Deposit: " + deposit);
            amount += deposit;
        }
        public void withdrawAmount(){  //double withdraw
            if(withdraw >= amount){
                System.out.println("Insufficient Amount!");
            }
            else{
                System.out.println("Withdraw: " + withdraw);
                amount -= withdraw;
            }
        }
        public void balance(){
            System.out.println("Available Balance: " + amount);
        }
    }
}