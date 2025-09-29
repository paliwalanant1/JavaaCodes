package object.cloneobject.shallowcopy.clonethriteen;

public class Hotel implements Cloneable {
    private String name;
    private int rooms;

    public Hotel(String name, int rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showHotel() {
        System.out.println("Hotel: " + name + ", Rooms: " + rooms);
    }
}
