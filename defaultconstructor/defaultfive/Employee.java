package constructor.defaultconstructor.defaultfive;

public class Employee extends Company{
    private String name;

    public Employee() {
        super();
        name = "Anant";
    }

    public void details() {
        System.out.println("Company: " + company + ", Employee: " + name);
    }
}
