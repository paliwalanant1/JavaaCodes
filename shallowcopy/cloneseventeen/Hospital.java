package object.cloneobject.shallowcopy.cloneseventeen;

public class Hospital implements Cloneable {
    private String hospitalName;
    private int doctors;

    public Hospital(String hospitalName, int doctors) {
        this.hospitalName = hospitalName;
        this.doctors = doctors;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void info() {
        System.out.println("Hospital: " + hospitalName + ", Doctors: " + doctors);
    }
}
