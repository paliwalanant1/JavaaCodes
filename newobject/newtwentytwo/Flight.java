package object.newobject.newtwentytwo;

public class Flight {
    private String airline;
    private int capacity;

    public Flight(String airline, int capacity) {
        this.airline = airline;
        this.capacity = capacity;
    }

    public void details() {
        System.out.println("Flight Airline: " + airline + ", Capacity: " + capacity);
    }
}
