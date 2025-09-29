package constructor.parameterizeconstructor.staticvalues.parameterizeone;

public class CarInfo {
    public static void main(String[] args) {
        Car obj = new Car("Maruti", "Dezire", 560000);
        System.out.println("Company: " + obj.getCompany() + ", Model: " + obj.getModel() + ", Price: " + obj.getPrice());
    }
}
