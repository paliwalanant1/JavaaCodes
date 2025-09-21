package classes.pojoclass.pojothree;

public class Main {
    public static void main(String[] args) {
        Address a = new Address("Indore");
        Person p = new Person("Anant", a);
        System.out.println(p.getName() + " lives in " + p.getAddress().getCity());
    }
}