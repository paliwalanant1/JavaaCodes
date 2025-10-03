package practicequestions.stringquestions.one;

public class Reverse {
    public static void main(String[] args) {
        String s = "Yash";
        char[] c = s.toCharArray();
        for(int i = c.length-1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}