package constructor.parameterizeconstructor.dynamicvalues.parameterizetwo;
import java.util.Scanner;

public class ShowMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        StudentMarks s = new StudentMarks(name, marks);
        s.display();
    }
}
