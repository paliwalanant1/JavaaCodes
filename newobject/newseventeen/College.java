package object.newobject.newseventeen;

public class College {
    private String name;
    private String city;

    public College(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void showCollege() {
        System.out.println("College: " + name + ", City: " + city);
    }
}
