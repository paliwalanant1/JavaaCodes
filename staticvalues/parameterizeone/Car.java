package constructor.parameterizeconstructor.staticvalues.parameterizeone;

public class Car {
    private String company;
    private String model;
    private int price;

    public Car(String company, String model, int price){
        this.company = company;
        this.model = model;
        this.price = price;
    }
    public String getCompany(){
        return company;
    }
    public String getModel(){
        return model;
    }
    public int getPrice(){
        return price;
    }
}
