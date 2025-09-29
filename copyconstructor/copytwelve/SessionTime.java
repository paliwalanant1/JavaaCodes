package constructor.copyconstructor.copytwelve;

public class SessionTime {
    public static void main(String[] args) {
        Session s1 = new Session("123456", System.currentTimeMillis());
        Session s2 = new Session(s1);
        System.out.println(s2);
    }
}
