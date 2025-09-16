package Encapsulation;

class Detail{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
public class Enc4 {
    public static void main(String[] args) {
     Detail obj = new Detail();
     obj.setName("Anant Paliwal");
     obj.setAge(20);

     System.out.println(obj.getName());
     System.out.println(obj.getAge());
    }
}
