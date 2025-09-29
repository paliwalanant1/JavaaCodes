package constructor.parameterizeconstructor.staticvalues.parameterizenineteen;

public class HouseInfo {
    public static void main(String[] args) {
        House h = new House("MR10 sukhliya Indore", 6);
        System.out.println(h.getAddress() + " - Rooms: " + h.getRooms());
    }
}
