package object.newobject.newsix;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}
