package practicequestions.stringquestions.seven;
//Convert the first letter of every word in a string to uppercase.

public class Uppercase {
    public static void main(String[] args) {
        String s = "my name is anant";
        String words[] = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }

        System.out.println(result);
    }
}
