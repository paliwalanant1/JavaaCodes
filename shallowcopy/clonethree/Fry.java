package object.cloneobject.shallowcopy.clonethree;

public class Fry implements Cloneable{
    public String samosa;
    public String kachori;

    public Fry(String samosa, String kachori){
        this.samosa = samosa;
        this.kachori = kachori;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}