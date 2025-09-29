package object.cloneobject.shallowcopy.clonetwelve;

public class BikeDetail {
    public static void main(String[] args) {
        try {
            Bike b1 = new Bike("Royal Enfield", 350);
            Bike b2 = (Bike) b1.clone();
            b1.details();
            b2.details();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
    }

}
