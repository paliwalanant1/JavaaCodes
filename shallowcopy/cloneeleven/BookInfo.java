package object.cloneobject.shallowcopy.cloneeleven;

public class BookInfo {
    public static void main(String[] args) {
        try {
            Book b1 = new Book("Java Basics", "James Gosling");
            Book b2 = (Book) b1.clone();
            b1.printBook();
            b2.printBook();
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
