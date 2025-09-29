package object.cloneobject.shallowcopy.copytwentyone;

public class Restaurant implements Cloneable {
    private String name;
    private String cuisine;

    public Restaurant(String name, String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Restaurant: " + name + ", Cuisine: " + cuisine);
    }

    public static void main(String[] args) {
        try {
            Restaurant r1 = new Restaurant("Spice Hub", "Indian");
            Restaurant r2 = (Restaurant) r1.clone();
            r1.display();
            r2.display();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
