package object.newobject.newtwentynine;

public class Hospital {
    private String hospitalName;
    private int beds;

    public Hospital(String hospitalName, int beds) {
        this.hospitalName = hospitalName;
        this.beds = beds;
    }

    public void display() {
        System.out.println("Hospital: " + hospitalName + ", Beds: " + beds);
    }
}
