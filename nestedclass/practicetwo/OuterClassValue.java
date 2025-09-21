package classes.nestedclass.practicetwo;

public class OuterClassValue {
    public String name;
    public class Inner{
        public void display(){
            System.out.println("Name: " + name);
        }
    }
}
