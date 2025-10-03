package practicequestions.arrayquestions.nine;

public class Add {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int add = 0;

        for(int i = 0; i < arr.length; i++){
            add += arr[i];
        }
        System.out.print("Addition of array: " + add);
    }
}
