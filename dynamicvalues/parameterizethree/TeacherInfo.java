package constructor.parameterizeconstructor.dynamicvalues.parameterizethree;
import java.util.Scanner;

public class TeacherInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Teacher Name: ");
        String t = sc.nextLine();
        System.out.print("Enter Subject: ");
        String s = sc.nextLine();
        TeacherSubject ts = new TeacherSubject(t, s);
        ts.show();
    }
}
