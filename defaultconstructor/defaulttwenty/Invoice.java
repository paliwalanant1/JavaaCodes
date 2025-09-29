package constructor.defaultconstructor.defaulttwenty;

public class Invoice {
    private String invoiceNo;
    private double total;

    public Invoice() {
        this.invoiceNo = "INV-0";
        this.total = 154.8;
    }
    public String getInvoiceNo() {
        return invoiceNo;
    }
    public double getTotal() {
        return total;
    }
}
