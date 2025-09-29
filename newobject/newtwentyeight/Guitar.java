package object.newobject.newtwentyeight;

public class Guitar {
    private double price;

    public Guitar(double price) {
        this.price = price;
    }

    public void play() {
        System.out.println("Guitar Price: " + price);
    }
}
