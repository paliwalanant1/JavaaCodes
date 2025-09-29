package constructor.defaultconstructor.defaulttwelve;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        this.accountNumber = "154352154";
        this.balance = 15500.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
