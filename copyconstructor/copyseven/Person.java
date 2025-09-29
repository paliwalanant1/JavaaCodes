package constructor.copyconstructor.copyseven;

public class Person {
    private String firstName;
    private String lastName;

    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return firstName + " " + lastName;
    }
}