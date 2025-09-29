package constructor.copyconstructor.copysix;

public class SongInfo {
    public static void main(String[] args) {
        Song s1 = new Song("Mujhko Yaad Sataye Teri", "Himesh Reshammiya");
        Song s2 = new Song(s1);
        System.out.println("Song: " + s2);
    }
}
