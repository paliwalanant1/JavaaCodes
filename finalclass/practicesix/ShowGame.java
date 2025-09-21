package classes.finalclass.practicesix;
import java.util.Scanner;
public class ShowGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Game: ");
        Game.game = sc.nextLine();
        Game.gameName();

    }
}
