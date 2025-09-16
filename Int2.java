package Abstraction;
interface BankOne{
    abstract void bankOneName();
}
interface BankTwo{
    abstract void bankTwoName();
}
class BankName implements BankOne, BankTwo{
    public void bankOneName(){
        System.out.println("HDFC Bank");
    }
    public void bankTwoName(){
        System.out.println("IDFC Bank");
    }
}
public class Int2 {
    public static void main(String[] args) {
        BankName obj = new BankName();
        obj.bankOneName();
        obj.bankTwoName();
    }
}
