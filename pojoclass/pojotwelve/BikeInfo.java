package classes.pojoclass.pojotwelve;

public class BikeInfo {
    public static void main(String[]args){

        Bike obj = new Bike(2018, "Honda Livo");

        System.out.println("bike: "+obj.getName());
        System.out.println("Model: "+obj.getModel());
    }
}
