package object.cloneobject.shallowcopy.clonetwo;

public class Address implements Cloneable{
    public String name;

    public Address(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}