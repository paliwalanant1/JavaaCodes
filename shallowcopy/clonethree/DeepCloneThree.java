package object.cloneobject.shallowcopy.clonethree;

public class DeepCloneThree {
    public static void main(String[] args) {
        try{
            Steam obj1 = new Steam("Pohaa", new Fry("Samosaa", "Kachorii"));
            Steam obj2 = (Steam) obj1.clone();

            obj2.fry.samosa = "Hot Samosa";
            obj2.fry.kachori = "Hot Kachori";
            obj2.poha = "Hot Pohaa";

            System.out.println("cloned: " + obj1.poha  + " " + obj1.fry.samosa + " " + obj1.fry.kachori + "\n");
            System.out.println("Original: " + obj2.poha + " " + obj2.fry.samosa + " " + obj2.fry.kachori + "\n");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
