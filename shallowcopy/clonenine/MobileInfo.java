package object.cloneobject.shallowcopy.clonenine;

public class MobileInfo {
    public static void main(String[] args)  {
        try {
            Mobile m1 = new Mobile("Samsung", 25000);
            Mobile m2 = (Mobile) m1.clone();
            System.out.println(m1);
            System.out.println(m2);
            m1.showMobile();
            m2.showMobile();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
