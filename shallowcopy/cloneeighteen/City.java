package object.cloneobject.shallowcopy.cloneeighteen;

public class City implements Cloneable {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("City: " + name + ", Population: " + population);
    }
}
