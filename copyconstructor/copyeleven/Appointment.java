package constructor.copyconstructor.copyeleven;

public class Appointment {
    private String id;
    private String dateTime;

    public Appointment(Appointment other) {
        this.id = other.id;
        this.dateTime = other.dateTime;
    }
    public Appointment(String id, String dateTime) {
        this.id = id;
        this.dateTime = dateTime;
    }
    public String toString(){
        return id + " - " + dateTime;
    }
}
