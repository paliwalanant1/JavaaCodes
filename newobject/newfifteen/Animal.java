package object.newobject.newfifteen;

public class Animal {
    private String type;
    private int age;

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void speak() {
        System.out.println("Animal: " + type + ", Age: " + age);
    }
}
