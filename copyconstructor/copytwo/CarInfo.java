package constructor.copyconstructor.copytwo;

public class CarInfo {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2022);
        Car c2 = new Car(c1);
        System.out.println(c1.getModel() + " - " + c1.getYear());
        System.out.println(c2.getModel() + " - " + c2.getYear());
    }
}
