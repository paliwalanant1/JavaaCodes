package constructor.parameterizeconstructor.staticvalues.parameterizetwosix;

public class MessageShow {
    public static void main(String[] args) {
        Message m = new Message("Anant", "Hello Sir");
        System.out.println(m.getFrom() + " - " + m.getBody());
    }
}
