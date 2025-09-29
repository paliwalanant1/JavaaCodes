package object.newobject.newtwentytwo;

public class FlightInfo {
    public static void main(String[] args) {
        Flight f1 = new Flight("Air India", 180);
        Flight f2 = new Flight("IndiGo", 220);

        f1.details();
        f2.details();
    }
}
