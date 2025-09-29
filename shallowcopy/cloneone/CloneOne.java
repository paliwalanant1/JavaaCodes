package object.cloneobject.shallowcopy.cloneone;

public class CloneOne implements Cloneable{
    public int rollNo;
    public String name;

    public CloneOne(int rollNo, String name){
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Name: " + name + ", RollNo: " + rollNo);
    }

    @Override
    protected Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}