package classes.pojoclass.pojosix;

public class SquareArea {
    private int side;

    public SquareArea(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}
