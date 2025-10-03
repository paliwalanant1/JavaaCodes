package practicequestions.operatorquestions.two;
//Check if a number is even or odd using bitwise operator

import java.util.Scanner;
public class OddEven {
    public int a;

    public void check(){
         if((a&1)==0){                      //6 & 1 -->  110 & 001 --> 0 ||  --> Sirf 1 & 1 = 1, baaki sab 0 ho jaata hai
             System.out.println("Even");
         }else{
             System.out.println("Odd");
         }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddEven obj = new OddEven();
        System.out.print("A: ");
        obj.a = sc.nextInt();
        obj.check();
    }
}
