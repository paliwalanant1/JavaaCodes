package constructor.copyconstructor.copyfour;

public class Item {
    private String item;
    private int quantity;

    public Item(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Item(Item other) {
        this.item = other.item;
        this.quantity = other.quantity;
    }
    public String toString(){
        return item + " - " + quantity;
    }
}
