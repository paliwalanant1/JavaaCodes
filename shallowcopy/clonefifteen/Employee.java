package object.cloneobject.shallowcopy.clonefifteen;

public class Employee implements Cloneable {
    private String empName;
    private double salary;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void show() {
        System.out.println("Employee: " + empName + ", Salary: " + salary);
    }
}
