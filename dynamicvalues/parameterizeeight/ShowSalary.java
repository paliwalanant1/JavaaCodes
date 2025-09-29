package constructor.parameterizeconstructor.dynamicvalues.parameterizeeight;
import java.util.Scanner;
public class ShowSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Salary: ");
        double s = sc.nextDouble();
        EmployeeSalary e = new EmployeeSalary(n, s);
        e.display();
    }
}
