package object.cloneobject.shallowcopy.cloneone;

public class MainCloneOne {
    public static void main(String[] args) {
        try {
            CloneOne obj1 = new CloneOne(121, "Anant Paliwal");
            CloneOne obj2 = (CloneOne) obj1.clone();

            obj2.rollNo = 100;
            obj2.name = "Anant";
            System.out.println("Value after cloning");
            System.out.println("Name: " + obj2.name + ", RollNo: " + obj2.rollNo);
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
