package constructor.parameterizeconstructor.dynamicvalues.parameterizeeleeven;
import java.util.Scanner;

public class ShowMovieInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Title: ");
        String t = sc.nextLine();
        System.out.print("Enter Year: ");
        int y = sc.nextInt();
        MovieInfo m = new MovieInfo(t, y);
        m.display();
    }
}
