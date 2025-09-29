package constructor.copyconstructor.copyfifteen;

public class Wallet {
    private String owner;
    private double balance;

    public Wallet(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public Wallet(Wallet other) {
        this.owner = other.owner;
        this.balance = other.balance;
    }
    public String toString(){
        return owner + " - " + balance;
    }
}