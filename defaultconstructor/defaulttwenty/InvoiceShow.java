package constructor.defaultconstructor.defaulttwenty;

public class InvoiceShow {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        System.out.println(inv.getInvoiceNo() + " - " + inv.getTotal());
    }
}