package object.cloneobject.shallowcopy.clonenineteen;

public class University implements Cloneable {
    private String uniName;
    private int establishedYear;

    public University(String uniName, int establishedYear) {
        this.uniName = uniName;
        this.establishedYear = establishedYear;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void details() {
        System.out.println("University: " + uniName + ", Established: " + establishedYear);
    }
}
