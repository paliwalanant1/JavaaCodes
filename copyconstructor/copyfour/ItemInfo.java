package constructor.copyconstructor.copyfour;

public class ItemInfo {
    public static void main(String[] args) {
        Item i1 = new Item("facewashh", 10);
        Item i2 = new Item(i1);
        System.out.println(i1);
        System.out.println(i2);
    }
}
