package constructor.defaultconstructor.defaultnine;

public class Cars {
    protected String model;
    protected int year;

    protected Cars() {
        this.model = "Tata Nexon";
        this.year = 2024;
    }

    public void show() {
        System.out.println(model + " - " + year);
    }
}
