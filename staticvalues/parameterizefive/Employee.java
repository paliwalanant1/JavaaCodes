package constructor.parameterizeconstructor.staticvalues.parameterizefive;

public class Employee extends Company {
    private String name;

    public Employee(String company, String name) {
        super(company);
        this.name = name;
    }

    public void details() {
        System.out.println("Company: " + company + ", Employee: " + name);
    }
}