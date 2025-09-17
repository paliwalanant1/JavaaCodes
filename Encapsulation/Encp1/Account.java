package Encapsulation.Encp1;

public class Account{
    private double balance = 10000.00;

    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double amount){
        this.balance = this.balance + amount;
    }
}