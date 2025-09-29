package object.cloneobject.shallowcopy.clonefifteen;

public class EmployeeInfo {
    public static void main(String[] args)  {
        try {
            Employee e1 = new Employee("Anant", 50000);
            Employee e2 = (Employee) e1.clone();
            e2.setEmpName("Anant Paliwal");

            e1.show();
            e2.show();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
