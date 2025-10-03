package practicequestions.stringquestions.two;

public class PalindromTwo {
    public static void main(String[] args) {
        String sb1 = "Levl";

        StringBuffer sb2 = new StringBuffer(sb1);
        if (sb2.reverse().toString().equalsIgnoreCase(sb1)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
