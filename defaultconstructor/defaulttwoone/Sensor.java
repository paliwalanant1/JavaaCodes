package constructor.defaultconstructor.defaulttwoone;

public class Sensor {
    private String id;
    private double reading;

    public Sensor() {
        this.id = "S-014";
        this.reading = 92;
    }
    public String getId() {
        return id;
    }
    public double getReading() {
        return reading;
    }
}
