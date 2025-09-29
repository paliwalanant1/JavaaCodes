package constructor.copyconstructor.copyseven;

public class PersonInfo {
    public static void main(String[] args) {
        Person p1 = new Person("Anant", "Paliwal");
        Person p2 = new Person(p1);
        System.out.println("Person: " + p2);
    }
}
