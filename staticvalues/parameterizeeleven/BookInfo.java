package constructor.parameterizeconstructor.staticvalues.parameterizeeleven;

public class BookInfo {
    public static void main(String[] args) {

        Book obj = new Book("1984", "George Orwell");
        System.out.println(obj);

        System.out.println("Book title: " + obj.getTitle() + "\n" + "Book Author: " + obj.getAuthor());
    }
}
