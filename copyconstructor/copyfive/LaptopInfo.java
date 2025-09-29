package constructor.copyconstructor.copyfive;

public class LaptopInfo {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16);
        Laptop l2 = new Laptop(l1);
        System.out.println("Laptop: " + l2);
    }
}
