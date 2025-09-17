package Abstraction;
//Fully abstraction in Interface
interface Bank{
    abstract void saving();
    abstract void current();
}
class Account implements Bank{
    public void saving(){
        System.out.println("Saving Account");
    }
    public void current(){
        System.out.println("Current Account");
    }
}
public class Int1 {
    public static void main(String[] args) {
        Bank obj = new Account();
        obj.saving();
        obj.current();
    }
}

