package constructor.parameterizeconstructor.staticvalues.parameterizetwenty;

public class Company {
    private String name;
    private int employees;

    public Company(String name, int employees) {
        this.name = name;
        this.employees = employees;
    }
    public String getName() {
        return name;
    }
    public int getEmployees() {
        return employees;
    }
}
