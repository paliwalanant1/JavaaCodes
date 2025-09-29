package constructor.parameterizeconstructor.staticvalues.parameterizenine;

public class Car {
    protected String model;
    protected int year;

    protected Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void show() {
        System.out.println(model + " - " + year);
    }
}
