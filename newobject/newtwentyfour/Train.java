package object.newobject.newtwentyfour;

public class Train {
    private String name;
    private int coaches;

    public Train(String name, int coaches) {
        this.name = name;
        this.coaches = coaches;
    }

    public void info() {
        System.out.println("Train: " + name + ", Coaches: " + coaches);
    }
}
