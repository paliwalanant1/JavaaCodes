package constructor.parameterizeconstructor.dynamicvalues.parameterizeeight;

public class EmployeeSalary {
    private String Name;
    private double salary;

    public EmployeeSalary(String Name, double salary) {
        this.Name = Name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee: " + Name + ", Salary: " + salary);
    }
}
