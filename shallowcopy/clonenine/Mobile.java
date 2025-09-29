package object.cloneobject.shallowcopy.clonenine;

public class Mobile implements Cloneable{
    private String company;
    private double price;

    public Mobile(String company, double price) {
        this.company = company;
        this.price = price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showMobile() {
        System.out.println("Mobile: " + company + ", Price: " + price);
    }
    public String toString(){
        return company + " - " + price;
    }
}
