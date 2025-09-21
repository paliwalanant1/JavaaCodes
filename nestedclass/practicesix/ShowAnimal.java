package classes.nestedclass.practicesix;

public class ShowAnimal {
    public static void main(String[] args) {
        Animal outer = new Animal();
        Animal.Dog obj = outer.new Dog();
        obj.animal();
    }
}
