package classes.abstractclass.abstractthree;

public class Developer extends Employee {
    public Developer(String name) { super(name); }
    public void work() {
        System.out.println(name + " is doing coding");
    }
}