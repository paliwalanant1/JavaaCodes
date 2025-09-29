package constructor.copyconstructor.copyone;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.salary = other.salary;
    }

    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}