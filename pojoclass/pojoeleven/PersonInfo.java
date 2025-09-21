package classes.pojoclass.pojoeleven;

public class PersonInfo {
    public static void main(String[]args){

        Person obj = new Person(2324, "Anant Paliwal");

        System.out.println(" My name is: "+ obj.getname());
        System.out.println(" My ID is: "+ obj.getid());
    }
}
