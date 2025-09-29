package object.cloneobject.shallowcopy.clonefourteen;

public class TeacherInfo {
    public static void main(String[] args)  {
        try{
            Teacher t1 = new Teacher("Maths", 10);
            Teacher t2 = (Teacher) t1.clone();
            t2.profile();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}