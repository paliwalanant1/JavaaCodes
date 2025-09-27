package com.practiceclasses.nestedclass.practicenine;

public class MusicPlayer {
    public static class Playlist {
        private String playlist;
        private int songs;
        private int duration;

        public Playlist(String playlist, int songs) {
            this.playlist = playlist;
            this.songs = songs;
        }

        public String getPlaylist() {
            return playlist;
        }
        public int getSongs() {
                    return songs;
                }
        public int getDuration() {
                    return songs *= 5;
                }
    }
}
