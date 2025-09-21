package classes.pojoclass.pojotwelve;

public class Bike{
    private int model;
    private String name;

    public Bike(int model, String name){
        this.model = model;
        this.name = name;
    }
    public int getModel(){
        return this.model;
    }
    public void setModel(int model){
        this.model = model;
    }
    public String getName(){
        return this.name;
    }
    public void SetName(String name){
        this.name = name;
    }
}
