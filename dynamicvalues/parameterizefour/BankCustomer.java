package constructor.parameterizeconstructor.dynamicvalues.parameterizefour;

public class BankCustomer {
    private String name;
    private double balance;

    public BankCustomer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Customer: " + name + ", Balance: " + balance);
    }
}
