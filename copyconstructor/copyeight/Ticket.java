package constructor.copyconstructor.copyeight;

public class Ticket {
    private String id;
    private String seat;
    public Ticket(String id, String seat) {
        this.id = id;
        this.seat = seat;
    }

    public Ticket(Ticket other) {
        this.id = other.id;
        this.seat = other.seat;
    }
    public String toString(){
        return id + " - " + seat;
    }
}
