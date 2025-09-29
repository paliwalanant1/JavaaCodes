package object.cloneobject.shallowcopy.clonethriteen;

public class HotelInfo {
    public static void main(String[] args) {
        try {
            Hotel h1 = new Hotel("Taj Palace", 200);
            Hotel h2 = (Hotel) h1.clone();
            h2.showHotel();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
