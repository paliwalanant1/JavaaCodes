package constructor.parameterizeconstructor.staticvalues.parameterizenineteen;

public class House {
    private String address;
    private int rooms;

    public House(String address, int rooms) {
        this.address = address;
        this.rooms = rooms;
    }
    public String getAddress() {
        return address;
    }
    public int getRooms() {
        return rooms;
    }
}
