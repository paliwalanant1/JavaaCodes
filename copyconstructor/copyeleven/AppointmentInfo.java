package constructor.copyconstructor.copyeleven;

public class AppointmentInfo {
    public static void main(String[] args) {
        Appointment a1 = new Appointment("A101", "2025-09-29 10:00");
        Appointment a2 = new Appointment(a1);
        System.out.println("Appointment ID: " + a2);
    }
}
