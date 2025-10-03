package practicequestions.arrayquestions.one;
//Find the maximum and minimum element in an array

public class MinMax {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int min = arr[0];
        int max = arr[0];

         for(int i = 1; i < arr.length; i++){
             if(arr[i] < min){
                 min = arr[i];
             }
             if(arr[i] > max){
                 max = arr[i];
             }
         }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
