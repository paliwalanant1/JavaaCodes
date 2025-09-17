package Encapsulation.Encp1;

public class Enc1 {
    public static void main(String[] args) {
        Account obj = new Account();
        System.out.println(obj.getBalance());
        obj.setBalance(1500.00);
        System.out.println(obj.getBalance());
    }
}
