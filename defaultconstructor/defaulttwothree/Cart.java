package constructor.defaultconstructor.defaulttwothree;

public class Cart {
    private String item;
    private int itemCount;

    public Cart() {
        this.item = "Bornvita";
        this.itemCount = 2;
    }
    public String getOwner() {
        return item;
    }
    public int getItemCount() {
        return itemCount;
    }
}
