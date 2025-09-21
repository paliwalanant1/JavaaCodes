package classes.finalclass.practicetwo;
import java.util.Scanner;
public class ShowStudentDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();

        StudentDetail obj = new StudentDetail(name);
        obj.display();
    }
}
