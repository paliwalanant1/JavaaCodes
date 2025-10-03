package practicequestions.stringquestions.two;

public class PalindromOne {
    public static void main(String[] args) {
        String s1 = "Level";
        String s2 = s1;
        String s3 = "";

        char[] c = s1.toCharArray();

        for(int i = c.length-1; i >= 0; i--){
            s3 += c[i];
        }
        if(s1.equalsIgnoreCase(s3)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}

//    public class Palindrom {
//        public static void main(String[] args) {
//            String s1 = "Level";
//
//            StringBuffer sb1 = new StringBuffer("mom");
//            if (sb1.reverse().equals(sb1)) {
//                System.out.println("Palindrom");
//            } else {
//                System.out.println("Not Palindrom");
//            }
//        }
//    }