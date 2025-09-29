package object.newobject.newfive;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void info() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Anant", 50000);
        e1.info();
    }
}
