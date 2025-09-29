package constructor.parameterizeconstructor.staticvalues.parameterizetwoseven;

public class ConfigMain {
    public static void main(String[] args) {
        Config c = new Config("Theme", "Dark");
        System.out.println(c.getKey() + " - " + c.getValue());
    }
}
