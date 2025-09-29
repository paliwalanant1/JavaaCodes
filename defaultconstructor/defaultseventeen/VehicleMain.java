package constructor.defaultconstructor.defaultseventeen;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.getVin() + " - " + v.getType());
    }
}
