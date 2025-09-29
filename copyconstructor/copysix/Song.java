package constructor.copyconstructor.copysix;

public class Song {
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }
    public Song(Song other) {
        this.name = other.name;
        this.artist = other.artist;
    }
    public String toString(){
        return name + " By " + artist;
    }
}