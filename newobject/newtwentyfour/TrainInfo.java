package object.newobject.newtwentyfour;

public class TrainInfo {
    public static void main(String[] args) {
        Train t1 = new Train("Veer Bhumi Express", 20);
        Train t2 = new Train("Jodhpur Express", 16);

        t1.info();
        t2.info();
    }
}
