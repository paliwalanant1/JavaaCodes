package constructor.defaultconstructor.defaulttwotwo;

public class Profile {
    private String username;
    private String bio;

    public Profile() {
        this.username = "paliwalanant";
        this.bio = "photophile:)";
    }
    public String getUsername(){
        return username;
    }
    public String getBio() {
        return bio;
    }
}
