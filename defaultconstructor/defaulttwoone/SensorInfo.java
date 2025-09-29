package constructor.defaultconstructor.defaulttwoone;

public class SensorInfo {
    public static void main(String[] args) {
        Sensor s = new Sensor();
        System.out.println(s.getId() + " - " + s.getReading());
    }
}
