package constructor.copyconstructor.copyfifteen;

public class WalletInfo {
    public static void main(String[] args) {
        Wallet w1 = new Wallet("Anant", 5000);
        Wallet w2 = new Wallet(w1);
        System.out.println("Wallet Owner: " + w2);
    }
}
