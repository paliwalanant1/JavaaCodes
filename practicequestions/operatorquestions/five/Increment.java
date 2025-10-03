package practicequestions.operatorquestions.five;
import java.util.Scanner;
public class Increment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.println(-(~a));
    }
}