package object.cloneobject.shallowcopy.clonefour;

public class LaptopDetail {
    public static void main(String[] args)  {
        try {
            Laptop l1 = new Laptop("Dell", 16);
            Laptop l2 = (Laptop) l1.clone();
            l1.details();
            l2.details();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
