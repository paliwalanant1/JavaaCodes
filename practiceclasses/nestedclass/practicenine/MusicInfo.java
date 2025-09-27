package com.practiceclasses.nestedclass.practicenine;
import java.util.Scanner;
public class MusicInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Playlist: ");
        String playlist = sc.nextLine();
        System.out.print("Songs: ");
        int songs = sc.nextInt();

        MusicPlayer.Playlist inner = new MusicPlayer.Playlist(playlist, songs);
        System.out.println("Playlist: " + inner.getPlaylist());
        System.out.println("songs: " + inner.getSongs());
        System.out.println("Total Duration: " + inner.getDuration() + " mins");
    }
}
