package classes.pojoclass.pojotwo;

public class EmployeeDetail {
    public static void main(String[] args) {
        Employee e = new Employee("Ravi", 55000);
        System.out.println("Name: " + e.getName() + ", Salary: " + e.getSalary());
    }
}
