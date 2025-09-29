package object.cloneobject.shallowcopy.clonetwo;

public class CloneTwo implements Cloneable{
    public int id;
    public Address address;

    public CloneTwo(int id, Address address){
        this.id = id;
        this.address = address;
    }
    protected Object clone()throws CloneNotSupportedException{
        CloneTwo clonetwo = (CloneTwo) super.clone();
        clonetwo.address = (Address) address.clone();
        return clonetwo;
    }
}