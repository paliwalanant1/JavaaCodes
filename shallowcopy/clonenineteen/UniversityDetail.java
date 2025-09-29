package object.cloneobject.shallowcopy.clonenineteen;

public class UniversityDetail {
    public static void main(String[] args)  {
        try {
            University u1 = new University("Oriental University", 2011 );
            University u2 = (University) u1.clone();
            u1.details();
            u2.details();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
