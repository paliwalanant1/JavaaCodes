package constructor.defaultconstructor.defaultninteen;

public class PatientInfo {
    public static void main(String[] args) {
        Patient p = new Patient();
        System.out.println(p.getPatientId() + " - " + p.getName());
    }
}
