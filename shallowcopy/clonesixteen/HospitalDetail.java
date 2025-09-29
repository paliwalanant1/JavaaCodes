package object.cloneobject.shallowcopy.clonesixteen;

public class HospitalDetail {
    public static void main(String[] args) {
        try {
            Hospital h1 = new Hospital("Apollo", 120);
            Hospital h2 = (Hospital) h1.clone();
            h1.info();
            h2.info();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
