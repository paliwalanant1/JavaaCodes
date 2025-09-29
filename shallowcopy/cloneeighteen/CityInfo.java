package object.cloneobject.shallowcopy.cloneeighteen;

public class CityInfo {
    public static void main(String[] args)  {
        try {
            City c1 = new City("Indore", 3000000);
            City c2 = (City) c1.clone();
            c1.display();
            c2.display();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
