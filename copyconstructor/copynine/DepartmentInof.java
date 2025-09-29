package constructor.copyconstructor.copynine;

public class DepartmentInof {
    public static void main(String[] args) {
        Department d1 = new Department("CSE", 101);
        Department d2 = new Department(d1);
        System.out.println("Department: " + d2);
    }
}
