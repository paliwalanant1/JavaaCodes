package constructor.defaultconstructor.defaulteight;

public class Bank {
    private String name;

    private Bank() {
        name = "SBI Bank";
    }

    public void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.show();
    }
}