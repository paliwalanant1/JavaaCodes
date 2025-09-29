package object.newobject.newthirty;

public class Hotel {
    private String name;
    private int stars;

    public Hotel(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    public void show() {
        System.out.println("Hotel: " + name + ", Stars: " + stars);
    }
}
