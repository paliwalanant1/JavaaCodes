package classes.pojoclass.pojoeleven;

public class Person{
    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void setname(String n){
        name = n;
    }
    public String getname(){
        return name;
    }
    public void setid(int i){
        id = i;
    }
    public int getid(){
        return id;
    }
}