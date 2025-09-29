package object.cloneobject.shallowcopy.clonetwenty;

public class Library implements Cloneable {
    private String name;
    private int books;

    public Library(String name, int books) {
        this.name = name;
        this.books = books;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showLibrary() {
        System.out.println("Library: " + name + ", Books: " + books);
    }

    public static void main(String[] args) {
        try {
            Library l1 = new Library("Central Library", 50000);
            Library l2 = (Library) l1.clone();
            l1.showLibrary();
            l2.showLibrary();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
    }
}
}
