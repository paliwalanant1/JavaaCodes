package constructor.defaultconstructor.defaultten;

public class Share {
    private String share;
    private double price;

    protected Share() {
        share = "HDFC Bank Ltd.";
        price = 945.05;
    }

    protected void show() {
        System.out.println(share + " - " + price);
    }
}
