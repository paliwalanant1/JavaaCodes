package object.newobject.newtwentythree;

public class Airport {
    private String code;
    private String city;

    public Airport(String code, String city) {
        this.code = code;
        this.city = city;
    }

    public void display() {
        System.out.println("Airport Code: " + code + ", City: " + city);
    }
}
