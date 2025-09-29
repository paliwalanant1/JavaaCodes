package constructor.parameterizeconstructor.staticvalues.parameterizetwoone;

public class MainDoctor {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr.armaan malik", "Cardiology");
        System.out.println(d.getName() + " - " + d.getSpecialization());
    }
}
