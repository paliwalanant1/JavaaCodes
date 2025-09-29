package constructor.parameterizeconstructor.staticvalues.parameterizetwotwo;

public class Wishlist {
    private String owner;
    private String[] items;

    public Wishlist(String owner, String[] items) {
        this.owner = owner;
        this.items = items;
    }
    public String getOwner() {
        return owner;
    }
    public String[] getItems() {
        return items;
    }
}
