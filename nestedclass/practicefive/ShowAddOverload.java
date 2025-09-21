package classes.nestedclass.practicefive;
import java.util.Scanner;

public class ShowAddOverload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AddOverload outer = new AddOverload();
        AddOverload.Inner inner = outer.new Inner();

        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        sc.nextLine();

        System.out.print("If you want to add one more no. then type 'yes': ");
        String s = sc.nextLine();

        if(s.equalsIgnoreCase("yes")){
            System.out.print("C: ");
            int c = sc.nextInt();
            System.out.println(inner.add(a, b, c));
        }
        else{
            System.out.println(inner.add(a, b));
        }
    }
}
