package constructor.parameterizeconstructor.staticvalues.parameterizeeight;

public class Bank {
    private String name;

    private Bank(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Bank name: " + name);
    }

    public static void main(String[] args) {
        Bank obj = new Bank("SBI Bank");
        obj.show();
    }
}
