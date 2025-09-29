package constructor.parameterizeconstructor.staticvalues.parameterizetwenty;

public class CompanyEmployees {
    public static void main(String[] args) {
        Company c = new Company("Evision", 50);
        System.out.println(c.getName() + " - Employees: " + c.getEmployees());
    }
}
