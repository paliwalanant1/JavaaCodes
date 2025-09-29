package object.cloneobject.shallowcopy.clonesix;

public class Game implements Cloneable{
    private String name;
    private String genre;

    public Game(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void showGame() {
        System.out.println("Game: " + name + ", Genre: " + genre);
    }
}
