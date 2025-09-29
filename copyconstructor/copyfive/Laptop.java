package constructor.copyconstructor.copyfive;

public class Laptop {
    private String brand;
    private int ramGb;

    public Laptop(String brand, int ramGb) {
        this.brand = brand;
        this.ramGb = ramGb;
    }

    public Laptop(Laptop other) {
        this.brand = other.brand;
        this.ramGb = other.ramGb;
    }
    public String toString(){
        return brand + " - " + ramGb;
    }
}
