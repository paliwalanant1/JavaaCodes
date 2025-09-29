package constructor.copyconstructor.copyfourteen;

public class Notification {
    private String title;
    private String detail;

    public Notification(Notification other) {
        this.title = other.title;
        this.detail = other.detail;
    }
    public Notification(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }
    public String toString(){
        return title + " " + detail;
    }
}