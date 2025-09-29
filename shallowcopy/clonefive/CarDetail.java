package object.cloneobject.shallowcopy.clonefive;

public class CarDetail {
    public static void main(String[] args)  {
        try{
        Car c1 = new Car("Honda City", 2020);
        Car c2 = (Car) c1.clone();
        c1.info();
        c2.info();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }
}
