package constructor.copyconstructor.copyeight;

public class TicketInfo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("1204", "A11");
        Ticket t2 = new Ticket(t1);
        System.out.println("Ticket: " + t2);
    }
}
