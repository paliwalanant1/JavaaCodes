package classes.finalclass.practicefour;

public final class Detail {
    public String name;
    public int age;

    public Detail(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
