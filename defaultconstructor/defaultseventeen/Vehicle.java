package constructor.defaultconstructor.defaultseventeen;

public class Vehicle {
    private String name;
    private String type;

    public Vehicle() {
        this.name = "Thar";
        this.type = "Off-Roading";
    }
    public String getVin() {
        return name;
    }
    public String getType() {
        return type;
    }
}
