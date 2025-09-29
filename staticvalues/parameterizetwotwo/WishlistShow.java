package constructor.parameterizeconstructor.staticvalues.parameterizetwotwo;

public class WishlistShow {
    public static void main(String[] args) {
        String[] items = {"Book", "Pen"};
        Wishlist w = new Wishlist("Anant", items);
        System.out.println(w.getOwner() + " - " + String.join(", ", w.getItems()));
    }
}
