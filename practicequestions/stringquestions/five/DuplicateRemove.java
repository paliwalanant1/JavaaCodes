package practicequestions.stringquestions.five;
//Remove all duplicate characters from a string.

public class DuplicateRemove {
    public static void main(String[] args) {
        String str = "AnantPaliwal";
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result = result + ch;
            }

        }

        System.out.println("Original: " +str );
        System.out.println("Without Duplicates: " +result);
    }
}