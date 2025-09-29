package constructor.defaultconstructor.defaultfifteen;

public class Phone {
    private String manufacturer;
    private String model;

    public Phone() {
        this.manufacturer = "MI";
        this.model = "Redmi Note 10";
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public String toString(){
        return manufacturer + " - " + model;
    }
}
