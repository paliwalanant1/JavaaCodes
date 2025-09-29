package object.newobject.newnineteen;

public class BAnkAccountDetail {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Anant", 25000);
        BankAccount b2 = new BankAccount("Yash", 35000);

        b1.displayBalance();
        b2.displayBalance();
    }
}
