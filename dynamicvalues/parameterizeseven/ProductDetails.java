package constructor.parameterizeconstructor.dynamicvalues.parameterizeseven;

public class ProductDetails {
    private String name;
    private double price;

    public ProductDetails(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}
