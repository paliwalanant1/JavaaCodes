package constructor.parameterizeconstructor.staticvalues.parameterizetwoseven;

public class Config {
    private String key;
    private String value;

    public Config(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
