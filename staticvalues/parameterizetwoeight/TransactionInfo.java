package constructor.parameterizeconstructor.staticvalues.parameterizetwoeight;

public class TransactionInfo {
    public static void main(String[] args) {
        Transaction t = new Transaction("TX15742400", 25000);
        System.out.println(t.getTxId() + " - " + t.getAmount());
    }
}
