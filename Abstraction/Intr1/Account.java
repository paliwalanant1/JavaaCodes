package Abstraction.Intr1;

class Account implements Bank{
    public void saving(){
        System.out.println("Saving Account");
    }
    public void current(){
        System.out.println("Current Account");
    }
}