package object.newobject.newtwelve;

public class LaptopDetail {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell Inspiron", 55000);
        Laptop l2 = new Laptop("HP Pavilion", 60000);

        l1.details();
        l2.details();
    }
}
