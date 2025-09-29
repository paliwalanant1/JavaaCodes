package object.cloneobject.shallowcopy.cloneseven;

public class BankAccount implements Cloneable{
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String toString(){
        return accountHolder + " - " + balance;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
