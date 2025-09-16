package Encapsulation;

class Account{
    private double balance = 10000.00;

    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double amount){
        this.balance = this.balance + amount;
    }
}
public class Enc1 {
    public static void main(String[] args) {
        Account obj = new Account();
        System.out.println(obj.getBalance());
        obj.setBalance(1500.00);
        System.out.println(obj.getBalance());
    }
}
