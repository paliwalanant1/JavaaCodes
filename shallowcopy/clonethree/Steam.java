package object.cloneobject.shallowcopy.clonethree;

public class Steam implements Cloneable{
    public String poha;
    public Fry fry;

    public Steam(String poha, Fry fry){
        this.poha = poha;
        this.fry = fry;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Steam cloned = (Steam) super.clone();
        cloned.fry = (Fry) fry.clone();
        return cloned;
    }
}