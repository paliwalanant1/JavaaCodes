package classes.finalclass.practiceeleven;

public final class Immutable {
    private final int age;
    private final String name;

    public Immutable(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
