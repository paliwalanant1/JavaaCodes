package constructor.parameterizeconstructor.staticvalues.parameterizeten;

public class Share {
    private String share;
    private double price;

    protected Share(String share, double price) {
        this.share = share;
        this.price = price;
    }

    protected void show() {
        System.out.println(share + " - " + price);
    }
}
