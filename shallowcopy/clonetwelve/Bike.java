package object.cloneobject.shallowcopy.clonetwelve;

public class Bike implements Cloneable {
    private String model;
    private int cc;

    public Bike(String model, int cc) {
        this.model = model;
        this.cc = cc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void details() {
        System.out.println("Bike: " + model + ", CC: " + cc);
    }
}