package object.newobject.newtwentysix;

public class Restaurant {
    private String name;
    private String foodVariety;

    public Restaurant(String name, String foodVariety) {
        this.name = name;
        this.foodVariety = foodVariety;
    }

    public void info() {
        System.out.println("Restaurant: " + name + ", Food Type: " + foodVariety);
    }
}
