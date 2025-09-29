package constructor.defaultconstructor.defaulttwelve;

public class BankAccountInfo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        System.out.println(acc.getAccountNumber() + " - " +
                acc.getBalance());
    }
}
