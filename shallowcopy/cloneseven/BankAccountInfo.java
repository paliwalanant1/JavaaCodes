package object.cloneobject.shallowcopy.cloneseven;

public class BankAccountInfo {
    public static void main(String[] args) {
        try {
            BankAccount b1 = new BankAccount("Anant paliwal", 500010);
            BankAccount b2 = (BankAccount) b1.clone();
            System.out.println(b1);
            System.out.println(b2);
            }catch (CloneNotSupportedException e){
                System.out.println(e);
        }
    }
}
