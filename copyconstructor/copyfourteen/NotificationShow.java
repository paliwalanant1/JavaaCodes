package constructor.copyconstructor.copyfourteen;

public class NotificationShow {
    public static void main(String[] args) {
        Notification n1 = new Notification("WhatsApp", "Someone: hwy!");
        Notification n2 = new Notification(n1);
        System.out.println(n2);
    }
}
