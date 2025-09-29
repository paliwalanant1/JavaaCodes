package constructor.parameterizeconstructor.staticvalues.parameterizetwelve;

public class CourseInfo {
    public static void main(String[] args) {
        Course c = new Course("CAAE301EX", "Cloud Computing");
        System.out.println(c.getCode() + " - " + c.getTitle());
    }
}
