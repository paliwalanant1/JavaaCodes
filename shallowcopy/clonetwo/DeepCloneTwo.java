package object.cloneobject.shallowcopy.clonetwo;

public class DeepCloneTwo {
    public static void main(String[] args) {
        try {
            CloneTwo obj1 = new CloneTwo(8085, new Address("Anant"));
            CloneTwo obj2 = (CloneTwo) obj1.clone();
            System.out.println("Id: " + obj1.id + " Name: " + obj1.address.name);
            System.out.println("Id: " + obj2.id + " Name: " + obj2.address.name);

            obj2.id = 1234;
            obj2.address.name = "Paliwal";

            System.out.println("After changes in object.");
            System.out.println("Id: " + obj1.id + " Name: " + obj1.address.name);
            System.out.println("Id: " + obj2.id + " Name: " + obj2.address.name);
        }
        catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
