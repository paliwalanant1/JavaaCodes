package constructor.parameterizeconstructor.staticvalues.parameterizefifteen;

public class CustomerInfo {
    public static void main(String[] args) {
        Customer c = new Customer("Anant", "paliwalanant@mail.com");
        System.out.println(c.getName() + " - " + c.getEmail());
    }
}
