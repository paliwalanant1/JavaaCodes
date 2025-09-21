package classes.singletonclass.singlethree;

public class CheckEnumDetail {
    public static void main(String[] args) {
        CheckEnum s1 = CheckEnum.INSTANCE;
        CheckEnum s2 = CheckEnum.INSTANCE;
        System.out.println(s1 == s2);
        s1.show();
    }
}
