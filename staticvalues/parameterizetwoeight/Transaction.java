package constructor.parameterizeconstructor.staticvalues.parameterizetwoeight;

public class Transaction {
    private String txId;
    private double amount;

    public Transaction(String txId, double amount) {
        this.txId = txId;
        this.amount = amount;
    }
    public String getTxId() {
        return txId;
    }
    public double getAmount() {
        return amount;
    }
}
