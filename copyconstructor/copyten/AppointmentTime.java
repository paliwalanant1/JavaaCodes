package constructor.copyconstructor.copyten;

public class AppointmentTime {
    public static void main(String[] args) {
        Appointment a1 = new Appointment("123", "2025/09/29 10:00am");
        Appointment a2 = new Appointment(a1);
        System.out.println("Appointment: " + a2);
    }
}
