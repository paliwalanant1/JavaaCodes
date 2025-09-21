package classes.singletonclass.singleone;

public class CheckEager{
    public static void main(String[] args) {
        Eager eone = Eager.getEager();
        Eager etwo = Eager.getEager();

        System.out.println(eone.hashCode());
        System.out.println(etwo.hashCode());
        System.out.println(eone==etwo);

        System.out.println(eone);
    }
}
