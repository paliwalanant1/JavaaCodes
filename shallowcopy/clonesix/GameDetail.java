package object.cloneobject.shallowcopy.clonesix;

public class GameDetail {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game g1 = new Game("PUBG","Battleground");
        Game g2 = (Game) g1.clone();
        g1.showGame();
        g2.showGame();
    }
}
