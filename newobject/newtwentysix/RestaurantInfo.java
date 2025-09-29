package object.newobject.newtwentysix;

public class RestaurantInfo {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("TAJ", "Indian");
        Restaurant r2 = new Restaurant("Raja Ram", "North Indian");

        r1.info();
        r2.info();
    }
}
