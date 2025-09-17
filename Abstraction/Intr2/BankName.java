package Abstraction.Intr2;

public class BankName implements BankOne, BankTwo{
    public void bankOneName(){
        System.out.println("HDFC Bank");
    }
    public void bankTwoName(){
        System.out.println("IDFC Bank");
    }
}