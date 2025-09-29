package constructor.defaultconstructor.defaultninteen;

public class Patient {
    private String patientId;
    private String name;

    public Patient() {
        this.patientId = "123";
        this.name = "Dada ji";
    }
    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
}
