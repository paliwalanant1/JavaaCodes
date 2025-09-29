package object.cloneobject.shallowcopy.cloneten;

public class MovieDetail {
    public static void main(String[] args)  {
        try {
            Movie m1 = new Movie("Inception", "Christopher Nolan");
            Movie m2 = (Movie) m1.clone();
            m1.showMovie();
            m2.showMovie();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
