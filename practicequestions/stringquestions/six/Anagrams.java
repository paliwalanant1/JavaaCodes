package practicequestions.stringquestions.six;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "sign";
        String s2 = "sing";

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}