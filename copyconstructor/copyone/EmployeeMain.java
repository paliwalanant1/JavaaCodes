package constructor.copyconstructor.copyone;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anant", 50000);
        Employee e2 = new Employee(e1);
        System.out.println("Before copy");
        System.out.println(e1.getName() + " - " + e1.getSalary());
        System.out.println("After copy");
        System.out.println(e2.getName() + " - " + e2.getSalary());
    }
}
