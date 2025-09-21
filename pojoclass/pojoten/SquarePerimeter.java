package classes.pojoclass.pojoten;

public class SquarePerimeter {
    private int side;

    public SquarePerimeter(int side) {
        this.side = side;
    }

    public int getArea() {
        return 4 * side;
    }
}
