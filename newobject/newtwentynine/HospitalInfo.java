package object.newobject.newtwentynine;

public class HospitalInfo {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("Apollo", 200);
        Hospital h2 = new Hospital("Aurobindo", 800);

        h1.display();
        h2.display();
    }

}
