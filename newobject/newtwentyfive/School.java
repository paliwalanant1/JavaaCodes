package object.newobject.newtwentyfive;

public class School {
    private String name;
    private int strength;

    public School(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public void show() {
        System.out.println("School: " + name + ", Strength: " + strength);
    }
}
