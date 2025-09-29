package object.newobject.newnineteen;

public class BankAccount {
    private String holderName;
    private double balance;

    public BankAccount(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println(holderName + " has balance: " + balance);
    }
}
