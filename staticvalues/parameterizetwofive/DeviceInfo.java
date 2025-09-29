package constructor.parameterizeconstructor.staticvalues.parameterizetwofive;

public class DeviceInfo {
    public static void main(String[] args) {
        Device d = new Device("SN15432345", "MI");
        System.out.println(d.getSerial() + " - " + d.getModel());
    }
}
