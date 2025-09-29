package constructor.parameterizeconstructor.dynamicvalues.parameterizeone;
import java.util.Scanner;
public class BookInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        String title  = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();

        Book obj = new Book(title, author);
        System.out.println(obj);

        System.out.println("Book title: " + obj.getTitle() + "\n" + "Book Author: " + obj.getAuthor());
    }
}
