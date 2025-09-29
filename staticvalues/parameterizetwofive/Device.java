package constructor.parameterizeconstructor.staticvalues.parameterizetwofive;

public class Device {
    private String serial;
    private String model;

    public Device(String serial, String model) {
        this.serial = serial;
        this.model = model;
    }
    public String getSerial() {
        return serial;
    }
    public String getModel() {
        return model;
    }
}
